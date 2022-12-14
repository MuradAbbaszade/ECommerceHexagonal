package com.company.adapter.category.rest;

import category.model.Category;
import com.company.adapter.category.jpa.CategoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryAdapter categoryAdapter;

    @GetMapping("{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") int id){
        try{
            return ResponseEntity.ok(categoryAdapter.retrieve(id));
        }catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.getMessage() , ex);
        }
    }
}
