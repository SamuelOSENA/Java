package com.SOComVe.DBdeSOComVe.service;

import com.SOComVe.DBdeSOComVe.modelo.Usuarios;
import com.SOComVe.DBdeSOComVe.repository.RoleRepositorio;
import com.SOComVe.DBdeSOComVe.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UsuarioServiceINPM implements UsuarioService{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private RoleRepositorio roleRepositorio;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Usuarios user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepositorio.findAll()));
        usuarioRepositorio.save(user);
    }

    @Override
    public Usuarios findByUsername(String username){
        return usuarioRepositorio.findByUsername(username);
    }
}
