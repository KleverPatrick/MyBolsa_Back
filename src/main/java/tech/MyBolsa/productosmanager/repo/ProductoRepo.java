package tech.MyBolsa.productosmanager.repo;

//Esta es  una clase que pertenece a SpringData.
//Es momento de usar Spring Framework , cargar los diferentes beans e invocar al método save del repositorio.
import org.springframework.data.jpa.repository.JpaRepository;
import tech.MyBolsa.productosmanager.model.Producto;

import java.util.Optional;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
    void deleteProductoById(Long id);

    Optional<Producto> findProductoById(Long id);
}
