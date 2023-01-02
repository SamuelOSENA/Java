package com.SOComVe.DBdeSOComVe.service;


import com.SOComVe.DBdeSOComVe.modelo.Usuarios;

public interface UsuarioService {
    void save(Usuarios user);

    static Usuarios findByUsername(String username);


}