package edu.unam.integrador.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.unam.integrador.services.UsuarioService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/usuario")
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/login")
    public String mostrarLogin() {
        return "usuario/login";
    }
}
