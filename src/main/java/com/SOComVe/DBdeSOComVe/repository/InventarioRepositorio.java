package com.SOComVe.DBdeSOComVe.repository;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepositorio extends JpaRepository<Inventario,Long> {

}
