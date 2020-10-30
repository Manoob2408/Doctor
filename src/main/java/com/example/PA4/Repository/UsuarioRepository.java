package com.example.PA4.Repository;

import com.example.PA4.Entidade.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    
}
