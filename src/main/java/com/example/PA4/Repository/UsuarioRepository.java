package com.example.PA4.Repository;

import com.example.PA4.Model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("usuarioRepository")
    public interface UsuarioRepository 
            extends JpaRepository<Usuario, Long> {
        Usuario findByEmail(String email);
}