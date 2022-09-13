package com.company.adapter.product.rest;

import com.company.adapter.product.jpa.ProductAdapter;
import common.usecase.UseCaseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import product.model.Product;
import product.usecase.CreateProduct;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductAdapter productAdapter;

    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") int id){
        try {
            return ResponseEntity.ok(productAdapter.getProductById(id));
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.getMessage() , ex);
        }
    }
    @PostMapping("/save")
    public ResponseEntity<Product> save(@ModelAttribute("product") CreateProduct createProduct){
        try {
            return ResponseEntity.ok(productAdapter.createProduct(createProduct));
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.getMessage() , ex);
        }
    }
}