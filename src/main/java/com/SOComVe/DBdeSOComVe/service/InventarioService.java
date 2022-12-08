package com.SOComVe.DBdeSOComVe.service;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import com.SOComVe.DBdeSOComVe.repository.InventarioRepositorio;
import com.SOComVe.DBdeSOComVe.repository.InventarioServiceINPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService implements InventarioServiceINPM {

    @Autowired
    private InventarioRepositorio data;

    @Override
    public List<Inventario> Listar(){
        return (List<Inventario>)data.findAll();
    }

    @Override
    public Optional<Inventario> ListarId(long Id) {
        return data.findById(Id);
    }

    @Override
    public int save(Inventario i){
        int res=0;
        Inventario Inventarios=data.save(i);
        if (!Inventarios.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(Long Id) {
        data.deleteById(Id);

    }
}
