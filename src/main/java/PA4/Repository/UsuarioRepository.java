package PA4.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import PA4.Model.Usuario;

@Component
public class UsuarioRepository {
    
    private List<Usuario> usuarios;
    private int nextId;


    public List<Usuario> getAllUsuarios(){
        return usuarios;
    }
    
    public Optional<Usuario> getUsuarioById(int id){
        for (Usuario aux : usuarios) {
            if(aux.getIDUser() == id){
                return Optional.of(aux);
            }
        }

        return Optional.empty();
    }

	public Usuario salvar(Usuario usuario) {
        usuario.setIDUser(nextId++);
        usuario.add(usuario);
        return usuario;
	}

	public void remove(Usuario usu) {
        usuarios.remove(usu);
	}

	public Usuario update(Usuario usuario) {
        
        Usuario aux = getUsuarioById(usuario.getIDUser()).get();
        if(aux != null){
            aux.setEmail(usuario.getEmail());
            aux.setName(usuario.getName());
        }
        return aux;
        
	}

}
