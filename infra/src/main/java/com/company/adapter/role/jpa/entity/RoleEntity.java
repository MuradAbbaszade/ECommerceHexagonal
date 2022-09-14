package com.company.adapter.role.jpa.entity;


import com.company.common.entity.AbstractEntity;
import lombok.*;
import role.model.Role;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "role")
@RequiredArgsConstructor
@AllArgsConstructor
public class RoleEntity extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;


    public Role toModel() {
        return Role.builder()
                .id(super.getId())
                .name(name)
                .build();
    }

}