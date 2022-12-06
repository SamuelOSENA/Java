package com.SOComVe.DBdeSOComVe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table (name = "inventario")
public class Inventario {
    @NonNull
    @Id
    @GeneratedValue
    private long Id;
    @NonNull
    @GeneratedValue
    private String nombre;
    @NonNull
    @GeneratedValue
    private long cantidad;
    @NonNull
    @GeneratedValue
    private long codigo;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
