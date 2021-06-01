package tech.MyBolsa.productosmanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.MyBolsa.productosmanager.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUserById(String id);
}
