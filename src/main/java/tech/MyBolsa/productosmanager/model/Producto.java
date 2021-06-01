package tech.MyBolsa.productosmanager.model;

import javax.persistence.*;


import java.io.Serializable;

//Una entidad de persistencia (entity) es una
//clase de Java ligera, cuyo estado es persistido de manera asociada a una tabla en una base de datos relacional
@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String description;
    private String precio;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String productCode;

    //Necesitamos mapear la clase


    public Producto() {
    }

    public Producto(String name, String description, String precio, String imageUrl, String productCode) {
        this.name = name;
        this.description = description;
        this.precio = precio;
        this.imageUrl = imageUrl;
        this.productCode = productCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String  imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", precio='" + precio + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
