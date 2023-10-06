package com.example.models;

import com.example.enums.EmployeeStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Table (name = "employee")
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", columnDefinition = "BIGINT(20)")
    private long id;
    @Column(columnDefinition = "varchar(250)")
    private String address;
    @Column(columnDefinition = "datetime(6)")
    private LocalDateTime dod;
    @Column(columnDefinition = "varchar(150)")
    private String email;
    @Column(columnDefinition = "varchar(150)", name = "full_name")
    private String fullname;
    @Column(columnDefinition = "varchar(15)")
    private String phone;
    @Column(columnDefinition = "int(11)")
    private EmployeeStatus status;

    @OneToMany (mappedBy = "employee")
    private List<Order> orders;

    public Employee(long id, String address, LocalDateTime dod, String email, String fullname, String phone, EmployeeStatus status) {
        this.id = id;
        this.address = address;
        this.dod = dod;
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", dod=" + dod +
                ", email='" + email + '\'' +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
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

    public LocalDateTime getDod() {
        return dod;
    }

    public void setDod(LocalDateTime dod) {
        this.dod = dod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }
}
