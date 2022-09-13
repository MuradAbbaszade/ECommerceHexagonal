package com.company.adapter.role.jpa;

import com.company.adapter.product.jpa.entity.ProductEntity;
import com.company.adapter.role.jpa.entity.RoleEntity;
import com.company.adapter.role.jpa.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import role.model.Role;
import role.port.RolePort;

@Service
@RequiredArgsConstructor
public class RoleAdapter implements RolePort {

    private final RoleRepository roleRepository;

    @Override
    public Role retrieve(int id) throws Exception {
        return roleRepository.findById(id)
                .map(RoleEntity::toModel)
                .orElseThrow(() -> new Exception("Cannot found role for this id"));
    }
}
