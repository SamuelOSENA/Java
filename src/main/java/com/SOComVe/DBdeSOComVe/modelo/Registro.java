package com.SOComVe.DBdeSOComVe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table
public class Registro {
    @Id
    @GeneratedValue
    @NonNull
    private String UserName;
    @NonNull
    @GeneratedValue
    private String Password;

    @NonNull
    public String getUserName() {
        return UserName;
    }

    public void setUserName(@NonNull String userName) {
        UserName = userName;
    }

    @NonNull
    public String getPassword() {
        return Password;
    }

    public void setPassword(@NonNull String password) {
        Password = password;
    }
}
