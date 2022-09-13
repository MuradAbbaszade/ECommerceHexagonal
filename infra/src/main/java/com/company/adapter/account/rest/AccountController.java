package com.company.adapter.account.rest;

import account.model.Account;
import com.company.adapter.account.jpa.AccountAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountAdapter accountAdapter;

    @GetMapping("{id}")
    public ResponseEntity<Account> get(@PathVariable("id") int id) throws Exception {
        try {
            return ResponseEntity.ok(accountAdapter.retrieve(id));
        }    catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.getMessage() , ex);
        }
    }
}
