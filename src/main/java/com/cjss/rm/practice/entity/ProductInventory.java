package com.cjss.rm.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "product_inventory_tab")
public class ProductInventory {
    @Id
    private Integer id;
    private Integer quantity;

}
