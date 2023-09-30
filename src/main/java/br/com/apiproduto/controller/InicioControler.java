package br.com.apiproduto.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class InicioControler {

    @GetMapping
    public  String inicio(){
        return "Aplicação funmcionando";
    }

}
