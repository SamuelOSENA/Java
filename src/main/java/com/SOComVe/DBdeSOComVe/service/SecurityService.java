package com.SOComVe.DBdeSOComVe.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
