package edu.unam.integrador.model;
import jakarta.persistence.*;
@MappedSuperclass
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(Long id, String nombre, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean iniciarSesion(String correo, String contraseña) {
        if (this.correo.equals(correo) && this.contraseña.equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Correo o contraseña incorrectos.");
            return false;
        }
    }

    public void recuperarContraseña(String correo) {
        if (this.correo.equals(correo)) {
            System.out.println("Se ha enviado un enlace para recuperar la contraseña al correo: " + correo);
        } else {
            System.out.println("Correo no encontrado.");
        }
    }
}
