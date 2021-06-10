package tech.MyBolsa.productosmanager;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import tech.MyBolsa.productosmanager.model.Producto;
import tech.MyBolsa.productosmanager.service.ProductoService;
import java.util.List;

@RestController
@RequestMapping("/producto") //controlador que nos reedirecciona a un conjunto de opciones
public class ProductoResource {
    private final ProductoService productoService;

    public ProductoResource(ProductoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Producto>> getAllProductos(){
        List<Producto> productos = productoService.findAllProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Producto> getProductos(@PathVariable("id") Long id){
        Producto producto = productoService.findProductoById(id);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto){  
        Producto newProducto = productoService.addproducto(producto);
        
        return new ResponseEntity<>(newProducto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto){
        Producto updateProducto = productoService.updateProducto(producto);
        return new ResponseEntity<>(updateProducto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProducto(@PathVariable("id") Long id){
        productoService.deleteProducto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }







}
