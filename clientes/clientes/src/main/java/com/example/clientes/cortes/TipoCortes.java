package com.example.clientes.cortes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cortes")
public class TipoCortes {
    @GetMapping
    public void getAll(){

    }
}
