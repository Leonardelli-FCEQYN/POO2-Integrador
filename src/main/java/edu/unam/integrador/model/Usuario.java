package edu.unam.integrador.model;
import jakarta.persistence.*;
import lombok.Data;
@MappedSuperclass
@Data
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;

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
