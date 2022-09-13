package com.company.adapter.category.jpa.entity;

import category.model.Category;
import com.company.adapter.product.jpa.entity.ProductEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import product.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@ToString
@Data
@EqualsAndHashCode
@Table(name = "category")
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> productList;

    public CategoryEntity() {
    }
    public CategoryEntity(String name) {
        this.name=name;
    }
    public CategoryEntity(Integer id) {
        this.id = id;
    }
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (ProductEntity productEntity : productList) {
            products.add(productEntity.toModel());
        }
        return products;
    }

    public Category toModel() {
        return Category.builder()
                .id(id)
                .name(name)
                .productList(getProducts())
                .build();
    }

}