package edu.unam.integrador.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.unam.integrador.model.Producto;
import edu.unam.integrador.services.ProductoService;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("productos", productoService.getAllProductos());
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
    public String addCart(){
        return "usuario/carrito";
    }

}
