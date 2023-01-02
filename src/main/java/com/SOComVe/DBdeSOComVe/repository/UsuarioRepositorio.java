package com.SOComVe.DBdeSOComVe.repository;

import com.SOComVe.DBdeSOComVe.modelo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {
    Usuarios findByUsername(String username);
}
