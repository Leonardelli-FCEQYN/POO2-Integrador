package edu.unam.integrador.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private TipoUsuario tipo;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Producto> productos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Pedido> pedidos;
    
   
}
