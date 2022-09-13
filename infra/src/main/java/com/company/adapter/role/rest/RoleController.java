package com.company.adapter.role.rest;

import com.company.adapter.role.jpa.RoleAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import role.model.Role;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleAdapter roleAdapter;

    @GetMapping("{id}")
    public ResponseEntity<Role> getRole(@PathVariable("id") int id){
        try {
            return ResponseEntity.ok(roleAdapter.retrieve(id));
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.getMessage() , ex);
        }
    }
}