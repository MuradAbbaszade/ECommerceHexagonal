package com.company.adapter.category.jpa;

import category.model.Category;
import category.port.CategoryPort;
import com.company.adapter.account.jpa.entity.AccountEntity;
import com.company.adapter.category.jpa.entity.CategoryEntity;
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
    public Category retrieve(int id) throws Exception {
        return categoryRepository.findById(id)
                .map(CategoryEntity::toModel)
                .orElseThrow(() -> new Exception("Cannot found category for this id"));
    }
}
