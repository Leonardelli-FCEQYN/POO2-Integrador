package edu.unam.integrador.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.unam.integrador.model.Producto;
import edu.unam.integrador.model.Usuario;
import edu.unam.integrador.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    private ProductoService productoService;

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
    public String save(Producto producto){
        LOGGER.info("Este es el producto guardado: {}", producto);
        Usuario u = new Usuario(Long.valueOf(1), "", "", "", "", "", "", "");
        producto.setUsuario(u);
        productoService.createProducto(producto);
        return "redirect:/productos";
    }
}
