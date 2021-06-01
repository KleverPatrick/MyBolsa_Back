package tech.MyBolsa.productosmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.MyBolsa.productosmanager.model.Usuario;
import tech.MyBolsa.productosmanager.repo.UsuarioRepo;

@Service
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo  = usuarioRepo;
    }
    
    
    public Usuario addUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public List<Usuario>findAllUsuarios(){
        return usuarioRepo.findAll();
    }

    





}

