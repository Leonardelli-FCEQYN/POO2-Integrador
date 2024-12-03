package edu.unam.integrador.services;
import java.util.List;
import java.util.Optional;

import edu.unam.integrador.model.Usuario;

public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    Usuario save (Usuario usuario);
    Optional<Usuario> findByEmail(String email);
}
