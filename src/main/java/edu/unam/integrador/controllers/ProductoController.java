package edu.unam.integrador.controllers;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.unam.integrador.model.Producto;
import edu.unam.integrador.model.Usuario;
import edu.unam.integrador.services.GuardarImagenService;
import edu.unam.integrador.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    private ProductoService productoService;
    @Autowired
    private GuardarImagenService guardarImagenService;

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("productos", productoService.getAllProductos());
        return "productos/show";
    }
    
    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto, @RequestParam("img") MultipartFile file) throws IOException{
        LOGGER.info("Este es el producto guardado: {}", producto);
        Usuario u = new Usuario(Long.valueOf(1), "", "", "", "", "", "", "");
        producto.setUsuario(u);

        //Imágen
        if (producto.getId()==null) { // Cuando se crea un producto nuevo
            String nombreImagen = guardarImagenService.saveImage(file);
            producto.setImagen(nombreImagen);
        } else {
        }

        productoService.createProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoService.getProducto(id);
        producto = optionalProducto.get();

        LOGGER.info("El producto buscado es: {}", producto);
        model.addAttribute("producto", producto);
        
        return "productos/edit";
    };

    @PostMapping("/update")
    public String update(Producto producto, @RequestParam("img") MultipartFile file) throws IOException{
        
        Producto p = new Producto();
        p=productoService.getProducto(producto.getId()).get();

        if (file.isEmpty()) { // Cuando editamos un producto PERO no cambiamos de imagen
            producto.setImagen(p.getImagen());
        } else { // Cuando editamos el producto Y TAMBIÉN la imágen.
            if (!(p.getImagen().equals("default.jpg"))){ // Eliminamos la imagen cuando NO sea la imagen por defecto.
                guardarImagenService.deleteImage(p.getImagen());
            }
            String nombreImagen = guardarImagenService.saveImage(file);
            producto.setImagen(nombreImagen);
        }

        producto.setUsuario(p.getUsuario());
        productoService.updateProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        
        Producto p = new Producto();
        p = productoService.getProducto(id).get();

        // Eliminamos la imagen cuando NO sea la imagen por defecto.
        if (!(p.getImagen().equals("default.jpg"))){
            guardarImagenService.deleteImage(p.getImagen());
        }

        productoService.deleteProductoById(id);
        return "redirect:/productos";
    }
}
