package com.example.models;

import com.example.enums.ProductStatus;
import jakarta.persistence.*;

@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", columnDefinition = "BIGINT(20)")
    private long id;
    @Column(columnDefinition = "varchar(150)")
    private String name;
    @Column(columnDefinition = "varchar(250)")
    private String description;
    @Column(columnDefinition = "varchar(100)", name = "manufacturer_name")
    private String manufacturer;
    @Column(columnDefinition = "varchar(25)")
    private String unit;
    @Column(columnDefinition = "int(11)")
    private ProductStatus status;

    @OneToMany
    private ProductImage productImage;
    @OneToMany
    private ProductPrice productPrice;
    @OneToMany
    private OrderDetail orderDetail;

    public Product(long id, String name, String description, String manufacturer, String unit, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.unit = unit;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", unit='" + unit + '\'' +
                ", status=" + status +
                '}';
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
