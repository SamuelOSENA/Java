package com.SOComVe.DBdeSOComVe.service;

import com.SOComVe.DBdeSOComVe.Interface.Iinventario;
import com.SOComVe.DBdeSOComVe.InterfaceService.IinventarioService;
import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService implements IinventarioService {

    @Autowired
    private Iinventario data;

    @Override
    public List<Inventario> Listar() {
        return (List<Inventario>) data.findAll();
    }

    @Override
    public Optional<Inventario> ListarId(int Codigo) {
        return data.findById(Codigo);
    }

    @Override
    public int save(Inventario i) {
        int res=0;
        Inventario inventario=data.save(i);
        if (inventario != null){
            res=1;
        }
        return res  ;
    }

    @Override
    public void delete(int Codigo) {
        data.deleteById(Codigo);
    }
}
