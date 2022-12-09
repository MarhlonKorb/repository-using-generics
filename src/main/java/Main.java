import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Produto;
import models.Usuario;
import repositories.GenericRepository;

public class Main {
    public static void main (String[] args) throws JsonProcessingException {
        Usuario usuario = new Usuario(1, "Marhlon", 27, "Massa");
        Produto produto = new Produto(1, "Batata", 4.00);
    
        GenericRepository<Usuario> usuarioGenericRepository = new GenericRepository<>(new ObjectMapper());
        usuarioGenericRepository.save(usuario.getId().toString(), usuario);
        System.out.println(usuarioGenericRepository.get("1", Usuario.class));
        
        System.out.println("\n##########################\n");
    
        GenericRepository<Produto> produtoGenericRepository = new GenericRepository<>(new ObjectMapper());
        produtoGenericRepository.save(produto.getId().toString(), produto);
        System.out.println(produtoGenericRepository.get("1", Produto.class));
    
    }
}