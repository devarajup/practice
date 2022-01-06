package com.cjss.rm.practice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company_tab")
public class Company {
    @Id
    private  Integer id;
    private  String name;

    @ManyToMany
    @JoinTable(name = "cust_Com",
    joinColumns = @JoinColumn(name = "company_fk"),
    inverseJoinColumns = @JoinColumn(name = "customer_fk"))
    private List<Customer> customers;
}
