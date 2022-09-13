package com.company.adapter.role.jpa.repository;

import com.company.adapter.role.jpa.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
}
