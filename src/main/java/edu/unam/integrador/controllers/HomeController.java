package edu.unam.integrador.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.unam.integrador.model.DetallePedido;
import edu.unam.integrador.model.Pedido;
import edu.unam.integrador.model.Producto;
import edu.unam.integrador.model.Usuario;
import edu.unam.integrador.services.UsuarioService;
import edu.unam.integrador.services.PedidoService;
import edu.unam.integrador.services.ProductoService;


@Controller
@RequestMapping("/")
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ProductoService productoService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PedidoService pedidoService;

    //Para almacenar los detalles del pedido
    private ArrayList<DetallePedido> detalles = new ArrayList<>();
    //Datos del pedido
    private Pedido pedido = new Pedido();

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("productos", productoService.find4Productos());
        return "usuario/home";
    }

    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Long id, Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoService.getProducto(id);
        producto = optionalProducto.get();

        model.addAttribute("producto", producto);
        return "usuario/productohome";
    }

    @PostMapping("/cart")
    public String addCart(@RequestParam long id, @RequestParam int cantidad, Model model){
        
        DetallePedido detallePedido = new DetallePedido();
        Producto producto = new Producto();
        double subTotal=0;

        Optional<Producto> optionalProducto = productoService.getProducto(id);
        log.info("El producto añadido es: {}", optionalProducto.get());
        log.info("Cantidad: {}", cantidad);
        producto = optionalProducto.get();

        detallePedido.setCantidad(cantidad);
        detallePedido.setPrecio(producto.getPrecio());
        detallePedido.setNombre(producto.getNombre());
        detallePedido.setTotal(producto.getPrecio() * cantidad);
        detallePedido.setProducto(producto);

        //Validación para que el producto no se añada dos veces
        long idProducto = producto.getId();
        boolean ingresado = detalles.stream().anyMatch(p->p.getProducto().getId()==idProducto);

        if (!ingresado) { //Si no está en la lista de detalles, lo añadimos
            detalles.add(detallePedido);
        } else { //Si está en la lista de detalles, obtenemos actualizamos la cantidad y el subtotal.
            for (DetallePedido dp : detalles) {
                if (dp.getProducto().getId()==id) {
                    dp.setCantidad(dp.getCantidad()+cantidad);
                    dp.setTotal(producto.getPrecio()*dp.getCantidad());
                }
            }
        }

        subTotal=detalles.stream().mapToDouble(dt->dt.getTotal()).sum();

        pedido.setSubTotal(subTotal);
        model.addAttribute("cart", detalles);
        model.addAttribute("pedido", pedido);


        return "usuario/carrito";
    }

    //Quitar un producto del carrito de compras
    @GetMapping("/delete/cart/{id}")
    public String deleteProductoCart(@PathVariable long id, Model model){

        //Lista nueva de productos
        ArrayList<DetallePedido> detallesNuevos = new ArrayList<>();

        for (DetallePedido dp : detalles) {
            if (dp.getProducto().getId()!=id) {
                detallesNuevos.add(dp);   
            }
        }
        detalles = detallesNuevos;

        double subTotal=0;
        subTotal=detalles.stream().mapToDouble(dt->dt.getTotal()).sum();

        pedido.setSubTotal(subTotal);
        model.addAttribute("cart", detalles);
        model.addAttribute("pedido", pedido);

        return "usuario/carrito";
    }

    @GetMapping("/getCart")
    public String getCart(Model model){
        
        model.addAttribute("cart", detalles);
        model.addAttribute("pedido", pedido);
        
        return "/usuario/carrito";
    }

    @GetMapping("/pedido")
    public String pedido(Model model){
        
        Usuario usuario = usuarioService.findById(Long.valueOf(1)).get();
        model.addAttribute("cart", detalles);
        model.addAttribute("pedido", pedido);
        model.addAttribute("usuario", usuario);
        return "usuario/resumenpedido";
    }

    @GetMapping("/savePedido")
    public String savePedido(){
        
        //Fecha de creación
        LocalDate fechaCreacion = LocalDate.now();
        pedido.setFechaCreacion(fechaCreacion);
        pedido.setNumero(pedidoService.generarNumeroPedido());

        // Usuario
        Usuario usuario = usuarioService.findById(Long.valueOf(1)).orElse(null);
        if (usuario == null) {
            throw new IllegalStateException("Usuario no encontrado");
        }
        pedido.setUsuario(usuario);

        // Asociar detalles al pedido
        for (DetallePedido dp : detalles) {
            pedido.addDetalle(dp);
        }

        // Guarda el pedido (y automáticamente los detalles
        pedidoService.save(pedido);

        // Limpiar detalles y pedido
        detalles.clear();
        pedido = new Pedido();

        return "redirect:/";
    }

}
