package com.company.adapter.account.jpa;

import account.model.Account;
import account.port.AccountPort;
import com.company.adapter.account.jpa.entity.AccountEntity;
import com.company.adapter.account.jpa.respository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountAdapter implements AccountPort {

    private final AccountRepository accountRepository;

    @Override
    public Account retrieve(int id) throws Exception {
        return accountRepository.findById(id)
                .map(AccountEntity::toModel)
                .orElseThrow(() -> new Exception("Cannot found account for this id"));
    }
}
