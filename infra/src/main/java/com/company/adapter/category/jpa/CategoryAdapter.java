package com.company.adapter.category.jpa;

import category.model.Category;
import category.port.CategoryPort;
import com.company.adapter.category.jpa.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryAdapter implements CategoryPort {

    private final CategoryRepository categoryRepository;

    @Override
    public Category retrieve(int id) {
        return categoryRepository.findById(id).get().toModel();
    }
}
