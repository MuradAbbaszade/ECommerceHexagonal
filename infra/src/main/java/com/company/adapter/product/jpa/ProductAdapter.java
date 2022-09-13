package com.company.adapter.product.jpa;

import category.model.Category;
import com.company.adapter.category.jpa.CategoryAdapter;
import com.company.adapter.category.jpa.entity.CategoryEntity;
import com.company.adapter.category.jpa.repository.CategoryRepository;
import com.company.adapter.product.jpa.entity.ProductEntity;
import com.company.adapter.product.jpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import product.model.Product;
import product.port.ProductPort;
import product.usecase.CreateProduct;
import product.usecase.ProductRetrieve;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductAdapter implements ProductPort {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product createProduct(CreateProduct createProduct) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(createProduct.getName());
        productEntity.setCategory(categoryRepository.getReferenceById(createProduct.getCategoryId()));
        productEntity.setDescription(createProduct.getDesc());
        productEntity.setImage(createProduct.getImg());
        productEntity.setPrice(createProduct.getPrice());
        return productRepository.save(productEntity).toModel();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).get().toModel();
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }
}
