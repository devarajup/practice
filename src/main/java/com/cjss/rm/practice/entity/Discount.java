package com.cjss.rm.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "discount_tab")
public class Discount {
    @Id
    private Integer id;
    private String name;
    private String description;
    private  Double discount_percent;
    private Boolean active;

}
