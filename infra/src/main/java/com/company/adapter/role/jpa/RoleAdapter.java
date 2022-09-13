package com.company.adapter.role.jpa;

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
    public Role retrievePort(int id) {
        return roleRepository.findById(id).get().toModel();
    }
}
