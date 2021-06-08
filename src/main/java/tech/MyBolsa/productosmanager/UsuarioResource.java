package tech.MyBolsa.productosmanager;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.MyBolsa.productosmanager.model.Usuario;
import tech.MyBolsa.productosmanager.service.UsuarioService;

@RestController
@RequestMapping("/login") 
public class UsuarioResource {
    private final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario){
        Usuario newUsuario = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }



    @GetMapping("/usuario/{contraseña}")
    public ResponseEntity<Usuario> findUsuario(@PathVariable("contraseña") String contraseña){
       
        List<Usuario> users = usuarioService.findAllUsuarios();
        //verificar el recorrido del for
        Usuario  usuarioAux = null;
        for(Usuario user : users){
            usuarioAux = null;
            if(user.getContraseña().equals(contraseña)){
                System.out.println(user.getContraseña());
                usuarioAux = user;
                return new ResponseEntity<Usuario>(usuarioAux, HttpStatus.ACCEPTED);
                
            }
                 
        }
        return new ResponseEntity<Usuario>(usuarioAux, HttpStatus.ACCEPTED);
                
        
              
    }



}
