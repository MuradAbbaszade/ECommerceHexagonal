package com.company.adapter.product.rest;

import com.company.adapter.product.jpa.ProductAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import product.model.Product;
import product.usecase.CreateProduct;

@RestController
@RequestMapping("/productadmin")
@RequiredArgsConstructor
public class ProductAdminController {
    private final ProductAdapter productAdapter;

    @PostMapping("/delete")
    public void delete(){
           productAdapter.deleteAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody CreateProduct createProduct){
        try {
            return ResponseEntity.ok(productAdapter.createProduct(createProduct));
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, e.getMessage() , e);
        }
    }
}
