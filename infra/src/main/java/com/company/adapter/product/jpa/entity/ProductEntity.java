package com.company.adapter.product.jpa.entity;

import com.company.adapter.category.jpa.entity.CategoryEntity;
import com.company.common.entity.AbstractEntity;
import lombok.*;
import product.model.Product;
import javax.persistence.*;

@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "product")
@RequiredArgsConstructor
@AllArgsConstructor
public class ProductEntity extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private CategoryEntity category;

    public Product toModel() {
        return Product.builder()
                .id(super.getId())
                .name(name)
                .image(image)
                .description(description)
                .categoryId(category.getId())
                .price(price)
                .build();
    }
}
