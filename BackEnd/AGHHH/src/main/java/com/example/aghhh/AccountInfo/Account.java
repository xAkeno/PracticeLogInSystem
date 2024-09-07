package com.example.aghhh.AccountInfo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="AccountTB")
public class Account {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable=false, name="username")
    private String username;
    @Column(nullable = false, name="email")
    private String email;
    @Column(nullable = false, name = "password")
    private String password;
}
