package com.SOComVe.DBdeSOComVe.Interface;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iinventario extends CrudRepository<Inventario, Integer> {
}
