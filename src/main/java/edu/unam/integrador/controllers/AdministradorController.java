package edu.unam.integrador.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.unam.integrador.model.Producto;
import edu.unam.integrador.services.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    ProductoService productoService;

    @GetMapping("")
    public String home(Model model){
        
        ArrayList<Producto> productos = productoService.findAllProductos();
        model.addAttribute("productos", productos);
        
        return "administrador/home";
    }
}
