package com.example.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "product_price")
public class ProductPrice {
    @Id
    @Column(columnDefinition = "datetime(6)")
    private LocalDateTime price_date_time;
    @Column(columnDefinition = "varchar(255)")
    private String note;
    @Column(columnDefinition = "double")
    private double price;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductPrice(LocalDateTime price_date_time, String note, double price) {
        this.price_date_time = price_date_time;
        this.note = note;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "price_date_time=" + price_date_time +
                ", note='" + note + '\'' +
                ", price=" + price +
                '}';
    }

    public LocalDateTime getPrice_date_time() {
        return price_date_time;
    }

    public void setPrice_date_time(LocalDateTime price_date_time) {
        this.price_date_time = price_date_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
