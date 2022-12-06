package com.SOComVe.DBdeSOComVe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.SOComVe.DBdeSOComVe.modelo.Inventario;

@Controller
public class Controlador {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/Principal")
    public String menu(){
        return "main";
    }

    @GetMapping("/Listar")
    public String inventario(){
        return "inventario";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("Inventario",new Inventario());
        return "FormInventario";
    }

}
