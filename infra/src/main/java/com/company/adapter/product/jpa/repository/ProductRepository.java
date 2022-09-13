package com.company.adapter.product.jpa.repository;

import com.company.adapter.product.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
