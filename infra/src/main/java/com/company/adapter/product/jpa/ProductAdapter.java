package com.company.adapter.product.jpa;

import com.company.adapter.category.jpa.repository.CategoryRepository;
import com.company.adapter.product.jpa.entity.ProductEntity;
import com.company.adapter.product.jpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import product.model.Product;
import product.port.ProductPort;
import product.usecase.CreateProduct;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductAdapter implements ProductPort {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product createProduct(CreateProduct createProduct) throws Exception {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(createProduct.getName());
        productEntity.setCategory(categoryRepository.getReferenceById(createProduct.getCategoryId()));
        productEntity.setDescription(createProduct.getDesc());
        productEntity.setImage(createProduct.getImg());
        productEntity.setPrice(createProduct.getPrice());
        return (Optional.of(productRepository.save(productEntity))
                .map(ProductEntity::toModel)
                .orElseThrow(() -> new Exception("Product cannot created")));
    }

    @Override
    public Product getProductById(int id) throws Exception {
        return productRepository.findById(id)
                .map(ProductEntity::toModel)
                .orElseThrow(() -> new Exception("Cannot found product for this id"));
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }
}
