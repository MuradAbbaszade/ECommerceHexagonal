package com.company.adapter.role.jpa.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import role.model.Role;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "role")
public class RoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public RoleEntity() {
    }

    public RoleEntity(Integer id) {
        this.id = id;
    }

    public RoleEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Role toModel() {
        return Role.builder()
                .id(id)
                .name(name)
                .build();
    }

}