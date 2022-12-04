package com.SOComVe.DBdeSOComVe.InterfaceService;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface IinventarioService {
    public List<Inventario>Listar();
    public Optional<Inventario>ListarId(int Codigo);
    public int save(Inventario i);
    public void delete(int Codigo);


}
