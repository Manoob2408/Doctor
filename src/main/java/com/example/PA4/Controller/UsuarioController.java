package com.example.PA4.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.PA4.Service.UsuarioService;
import com.example.PA4.Model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

  @GetMapping("/usuarios")
  public List<Usuario> all() {
     return usuarioService.getAllUsuarios();
  }

  @PostMapping("/usuarios")
  public ResponseEntity<Usuario> createUsuario (@Valid @RequestBody Usuario usuario) {
      return ResponseEntity.ok(usuarioService.saveUsuario(usuario));
  }

  @PutMapping("/usuarios/{id}")
  public ResponseEntity<Usuario> updateUsuario(@Valid @RequestBody Usuario usuario,
    @PathVariable(value= "id") Long id) {
        return ResponseEntity.ok(usuarioService.updateUsuario(usuario, id));
    }

  @DeleteMapping("/usuarios/{id}")
  public ResponseEntity<?> deleteUsuario(@PathVariable Long id) {
    Map<String,String> response = new HashMap<String,String>();
    if(usuarioService.deleteUsuario(id)) {
      response.put("status", "success");
      response.put("message", "Usuario deleted successfully");
       return ResponseEntity.ok(response);
    } else {
      response.put("status", "error");
      response.put("message", "Something went wrong when delete the usuario");
      return ResponseEntity.status(500).body(response);
    }
  }
    
}
