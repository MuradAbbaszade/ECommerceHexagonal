package com.company.adapter.account.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import account.model.Account;
import com.company.adapter.role.jpa.entity.RoleEntity;
import com.company.common.entity.AbstractEntity;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Data
@ToString
@Table(name = "user")
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
public class AccountEntity extends AbstractEntity {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RoleEntity role;

    public Account toModel() {
        return Account.builder()
                .id(super.getId())
                .name(name)
                .password(password)
                .email(email)
                .role(role.toModel())
                .build();
    }
}