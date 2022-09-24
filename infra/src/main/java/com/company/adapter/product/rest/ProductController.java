package com.company.adapter.product.rest;

import com.company.adapter.product.jpa.ProductAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import product.model.Product;

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
}
