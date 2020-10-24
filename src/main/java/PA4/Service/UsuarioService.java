package PA4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import PA4.Model.Usuario;
import PA4.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repositorio;

    public Usuario getUsuarioById(int id){
        Optional<Usuario> op = repositorio.getUsuarioById(id);
        return op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Usuario nao cadastrado: " + id));
    }

    public Usuario fromUser(Usuario usu){
        Usuario usuario = new Usuario();

        usuario.setName(usu.getName());
        usuario.setEmail(usu.getEmail());
        usuario.setBirthDate(usu.getBirthDate());
        usuario.setGender(usu.getGender());
        usuario.setUsername(usu.getUsername());
        usuario.setPassword(usu.getPassword());

        return usuario;
    }



	public Usuario update(Usuario usuario) {
        getUsuarioById(usuario.getIDUser());
        return repositorio.update(usuario);
    }



	public List<Usuario> getAllUsuarios() {
		return repositorio.getAllUsuarios();
	}



	public Usuario salvar(Usuario usuario) {
		return repositorio.salvar(usuario);
	}



	public void removeById(int id) {
       repositorio.remove(getUsuarioById(id));
   }

    
}
