package com.company.adapter.category.jpa.entity;

import category.model.Category;
import com.company.adapter.product.jpa.entity.ProductEntity;
import com.company.common.entity.AbstractEntity;
import lombok.*;
import product.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@ToString
@Data
@EqualsAndHashCode
@Table(name = "category")
@RequiredArgsConstructor
@AllArgsConstructor
public class CategoryEntity extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> productList;

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (ProductEntity productEntity : productList) {
            products.add(productEntity.toModel());
        }
        return products;
    }

    public Category toModel() {
        return Category.builder()
                .id(super.getId())
                .name(name)
                .productList(getProducts())
                .build();
    }

}