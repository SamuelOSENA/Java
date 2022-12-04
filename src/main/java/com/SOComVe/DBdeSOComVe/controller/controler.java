package com.SOComVe.DBdeSOComVe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SOComVe.DBdeSOComVe.InterfaceService.IinventarioService;
import com.SOComVe.DBdeSOComVe.modelo.Inventario;


import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping
public class controler {


    @RequestMapping("/")
    public String Registro(){
        return "index";
    }

    @RequestMapping("/Principal")
    public String Principal(){
        return "main";
    }

    @Autowired
    private IinventarioService service;


    @GetMapping("/Listar")
    public String listar(Model model){
        List<Inventario>Listainventario=service.Listar();
        model.addAttribute("Inventario",Listainventario);
        return "inventario";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("Inventario",new Inventario());
        return "FormInventario";
    }

    @PostMapping("/save")
    public String save(@Validated Inventario i,Model model){
        service.save(i);
        return "redirect:/Listar";
    }
    @GetMapping("/editar/{Codigo}")
    public String editar(@PathVariable int Codigo, Model model){
        Optional<Inventario>Modificarinventario=service.ListarId(Codigo);
        model.addAttribute("Inventario",Modificarinventario);
        return "FormInventario";
    }
    @GetMapping("/eliminar/{Codigo}")
    public String eliminar(@PathVariable int Codigo){
        service.delete(Codigo);
        return "redirect:/Listar";
    }

}
