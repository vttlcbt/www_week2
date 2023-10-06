package com.example.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", columnDefinition = "BIGINT(20)")
    private long id;
    @Column(columnDefinition = "datetime(6)", name = "order_date")
    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    public Order(long id, LocalDateTime orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
