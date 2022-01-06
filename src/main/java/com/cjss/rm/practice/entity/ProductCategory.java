package com.cjss.rm.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category_tab")
public class ProductCategory {
    @Id
    private  Integer id;
    private  String name;
    private String description;

}
