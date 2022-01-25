package com.alvescosta.demovendas.controller;

import com.alvescosta.demovendas.model.entity.Servico;
import com.alvescosta.demovendas.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servicos")
public class ServicoControle {

    @Autowired
    private ServicoRepository servicoRepository;
/*
 *@Author Alves Costa
 * @Return Metodo salva um servico na base de dados
 */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Servico salvarServico(@RequestBody Servico servico){
        return servicoRepository.save(servico);
    }
}
