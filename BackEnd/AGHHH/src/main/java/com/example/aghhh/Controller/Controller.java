package com.example.aghhh.Controller;

import com.example.aghhh.AccountInfo.Account;
import com.example.aghhh.Service.Services;
import com.example.aghhh.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api")
@RestController
public class Controller {
    private Services service;
    @Autowired
    public Controller(Services service) {
        this.service = service;
    }
    @PostMapping("/create")
    public void createAccount(@RequestBody Account account) {
        service.create(account);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Account account) {
        boolean success = service.login(account.getUsername(), account.getPassword());
        if(success){
            return ResponseEntity.ok("Login Success");
        }
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Failed");
        }
    }

}
