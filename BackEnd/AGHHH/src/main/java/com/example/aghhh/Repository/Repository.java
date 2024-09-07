package com.example.aghhh.Repository;

import com.example.aghhh.AccountInfo.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Account, Integer> {
    @Query("SELECT s FROM Account s WHERE s.username = :username AND s.password = :password")
    Optional<Account> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
