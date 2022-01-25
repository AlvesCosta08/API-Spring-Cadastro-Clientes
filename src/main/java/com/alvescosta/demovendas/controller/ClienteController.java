package com.alvescosta.demovendas.controller;

import com.alvescosta.demovendas.model.entity.Cliente;
import com.alvescosta.demovendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
/*
*@Author Alves Costa
* @Return Metodo salva um cliente na base de dados
*/
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
   public Cliente salvar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
   }


}
