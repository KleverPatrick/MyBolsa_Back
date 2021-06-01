package tech.MyBolsa.productosmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.MyBolsa.productosmanager.exception.UserNotFoundException;
import tech.MyBolsa.productosmanager.model.Producto;
import tech.MyBolsa.productosmanager.repo.ProductoRepo;

//import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

@Service
public class ProductoService {
    private final ProductoRepo productoRepo;
  
    @Autowired
    public ProductoService(ProductoRepo productoRepo) {
        this.productoRepo = productoRepo;
    }

    /**
     * Metodo de tipo Producto en el que le pasamos un objeto de tipo Producto
     * ese objeto establece un codigo de producto con el uuid
     * @param producto
     * @return productoRepo.save(prodcuto)
     */
    public Producto addproducto(Producto producto){
        producto.setProductCode(UUID.randomUUID().toString());
        
        //guardamos la imagen en un directorio
        return productoRepo.save(producto);
           
    }

    /**
     *
     * @return una lista de productos
     */
    public List<Producto> findAllProductos(){
        return productoRepo.findAll();
    }

    /**
     *
     * @param producto
     * @return
     */
    public Producto updateProducto(Producto producto){
      return productoRepo.save(producto);
    }

    public Producto findProductoById( Long id){
        return productoRepo.findProductoById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+ id +" was not found"));
    }
    @Transactional
    public void deleteProducto(Long id){
        productoRepo.deleteProductoById(id);
    }

}
