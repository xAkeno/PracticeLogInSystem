package com.example.aghhh.Service;

import com.example.aghhh.AccountInfo.Account;
import com.example.aghhh.Repository.Repository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Services {
    private Repository repo;

    @Autowired
    public Services(Repository repo) {
        this.repo = repo;
    }

    public void create(Account account){
        repo.save(account);
    }
    public boolean login(String username, String password){
        return repo.findByUsernameAndPassword(username, password).isPresent();
    }
}
