package com.example.models;

import jakarta.persistence.*;

@Table(name = "order_detail")
public class OrderDetail {
    @Column(columnDefinition = "varchar(255)")
    private String note;
    @Column(columnDefinition = "double")
    private double price;
    @Column(columnDefinition = "double")
    private double quantity;

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderDetail(String note, double price, double quantity) {
        this.note = note;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "note='" + note + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
