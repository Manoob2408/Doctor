package com.example.PA4.Service;

import java.util.List;

import com.example.PA4.Model.Usuario;
import com.example.PA4.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("usuarioService")
public class UsuarioService {
   @Autowired
   private UsuarioRepository usuarioRepository;

   public Usuario findUsuarioByEmail(String email) {
       return usuarioRepository.findByEmail(email);
   }

   public List<Usuario> getAllUsuarios() {
       return usuarioRepository.findAll();
   }

   public Usuario saveUsuario(Usuario usuario) {
       return usuarioRepository.save(usuario);
   }

   public Usuario updateUsuario(Usuario usuario, Long id) {
     Usuario updateUsuario = usuarioRepository.findById(id).orElse(null);
     if(updateUsuario != null) {
        updateUsuario.setName (usuario.getName());
     }
     final Usuario myusuario = usuarioRepository.save(updateUsuario);
     return myusuario;
   }

   public Boolean deleteUsuario (Long id) {
      Usuario delUsuario  = usuarioRepository.findById(id).orElse(null);
      if(delUsuario != null) {
          usuarioRepository.delete(delUsuario);
          return true;
      }
      return false;
   }
}
