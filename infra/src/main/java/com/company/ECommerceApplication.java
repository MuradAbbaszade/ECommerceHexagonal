package com.company;

import category.model.Category;
import com.company.adapter.category.jpa.CategoryAdapter;
import com.company.adapter.product.jpa.ProductAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import product.model.Product;
import product.usecase.CreateProduct;
import product.usecase.ProductRetrieve;

@SpringBootApplication
public class ECommerceApplication {

    @Autowired
    ProductAdapter productAdapter;
    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) {

            }

        };
        return clr;
    }
    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }
}