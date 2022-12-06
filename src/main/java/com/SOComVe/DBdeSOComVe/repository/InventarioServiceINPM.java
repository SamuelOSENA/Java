package com.SOComVe.DBdeSOComVe.repository;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface InventarioServiceINPM  {
    public List<Inventario> Listar();
    public Optional<Inventario> ListarId(long Id);
    public int save (Inventario i);
    public void delete(Long Id);
}
