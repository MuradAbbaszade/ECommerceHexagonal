package com.company.adapter.product.rest;

import com.company.adapter.product.jpa.ProductAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productadmin")
@RequiredArgsConstructor
public class ProductAdminController {
    private final ProductAdapter productAdapter;

    @PostMapping("/delete")
    public void save(){
           productAdapter.deleteAll();
    }
}
