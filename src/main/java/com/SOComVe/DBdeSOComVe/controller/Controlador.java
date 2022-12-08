package com.SOComVe.DBdeSOComVe.controller;


import com.SOComVe.DBdeSOComVe.repository.InventarioServiceINPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {


    @Autowired
    private InventarioServiceINPM services;
    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/Principal")
    public String menu(){
        return "main";
    }

    @GetMapping("/listar")
    public String invention(Model model){
        List<Inventario> inventario=services.Listar();
        model.addAttribute("Inventarios",inventario);
        return "inventarariado";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("Inventario",new Inventario());
        return "FormInventarioSave";
    }

    @PostMapping("/save")
    public String save(@Validated Inventario i, Model model){
        services.save(i);
        return "redirect:/listar";
    }
    @GetMapping("/edit/{id}")
    public String ListarId(@PathVariable Long id, Model model){
        Optional<Inventario>inventario=services.ListarId(id);
        model.addAttribute("Inventario",inventario);
        return "FormInventarioSave";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable Long id){
        services.delete(id);
        return "redirect:/listar";
    }
}
