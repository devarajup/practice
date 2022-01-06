package com.cjss.rm.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product_tab")
public class Product {
    @Id
    private Integer id;
    private  String name;
    private  String description;
    private  String sku ;
    private  Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private  ProductInventory productInventory;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private  Discount discount;
}
