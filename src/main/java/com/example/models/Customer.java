package com.example.models;

import jakarta.persistence.*;

import java.util.List;
@Table (name = "customer")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id", columnDefinition = "BIGINT(20)")
    private long id;
    @Column(columnDefinition = "varchar(250)")
    private String address;
    @Column(columnDefinition = "varchar(150)")
    private String email;
    @Column(columnDefinition = "varchar(150)", name = "cust_name")
    private String name;
    @Column(columnDefinition = "varchar(15)")
    private String phone;

    @OneToMany (mappedBy = "customer")
    private List<Order> orders;

    public Customer(long id, String address, String email, String name, String phone) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
