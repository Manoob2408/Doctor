package PA4.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import PA4.Model.Usuario;
import PA4.Service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService servico;

    @GetMapping
    public List<Usuario> getUsuarios() {
        return servico.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioByCodigo(@PathVariable int id) {
        Usuario cli = servico.getUsuarioById(id);
        return ResponseEntity.ok(cli);	
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Usuario novoUsuario, 
                                       HttpServletRequest request,
                                       UriComponentsBuilder builder
                                       ) {
      
        Usuario usu = servico.salvar(servico.fromUser(novoUsuario));
        UriComponents uriComponents = builder.path(request.getRequestURI()+"/"+usu.getIDUser()).build();
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id){
        servico.removeById(id);
        return ResponseEntity.noContent().build();	
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable int id, @RequestBody Usuario usu){
    
        Usuario usuario = servico.fromUser(usu);
        usuario.setIDUser(id);
        usuario = servico.update(usuario);
        return ResponseEntity.ok(usuario);
        
    }
    
    


}

