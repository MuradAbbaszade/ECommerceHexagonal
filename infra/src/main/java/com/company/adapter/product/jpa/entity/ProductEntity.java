package com.company.adapter.product.jpa.entity;

import category.model.Category;
import com.company.adapter.category.jpa.entity.CategoryEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import product.model.Product;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "product")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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

    public ProductEntity() {
    }

    public ProductEntity(Integer id) {
        this.id = id;
    }

    public ProductEntity(Integer id, String name, String image, double price, String description, CategoryEntity category) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.category = category;
    }
    public Product toModel() {
        return Product.builder()
                .id(id)
                .name(name)
                .image(image)
                .description(description)
                .categoryId(category.getId())
                .price(price)
                .build();
    }
}
