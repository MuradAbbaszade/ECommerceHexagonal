package com.company.adapter.account.jpa.respository;

import com.company.adapter.account.jpa.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
}
