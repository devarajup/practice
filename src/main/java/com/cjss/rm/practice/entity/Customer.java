package com.cjss.rm.practice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_tab")
public class Customer {
    @Id
    private  Integer id;
    private  String name;
    private String email;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Product> products;

}
