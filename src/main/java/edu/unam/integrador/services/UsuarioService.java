package edu.unam.integrador.services;
import java.util.List;
import java.util.Optional;

import edu.unam.integrador.model.Usuario;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save (Usuario usuario);
    Optional<Usuario> findByEmail(String email);
}
