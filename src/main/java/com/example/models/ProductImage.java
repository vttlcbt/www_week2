package com.example.models;

import jakarta.persistence.*;

@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", columnDefinition = "BIGINT(20)")
    private long id;
    @Column(columnDefinition = "varchar(250)")
    private String alternative;
    @Column(columnDefinition = "varchar(250)")
    private String path;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductImage(long id, String alternative, String path) {
        this.id = id;
        this.alternative = alternative;
        this.path = path;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
