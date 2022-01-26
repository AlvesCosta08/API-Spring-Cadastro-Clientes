package com.alvescosta.demovendas.controller;

import com.alvescosta.demovendas.model.entity.Cliente;
import com.alvescosta.demovendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
 /*
  *@Author Alves Costa
  * @Return Metodo busca cliente por Id , caso não encontre retonar 404
  */
   @GetMapping("{id}")
   public Cliente buscarPorId(@PathVariable Integer id){
        return clienteRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
   }

  /*
   *@Author Alves Costa
   * @Return Metodo deleta um  cliente
   */
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
   public void deletar(@PathVariable Integer id){
        clienteRepository.findById(id)
                .map(cliente -> {
                    clienteRepository.delete(cliente);
                    return Void.TYPE;
                })
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
   }

   @PutMapping("{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
   public void atualizar(@PathVariable Integer id , @RequestBody Cliente clienteAtualizado){
       clienteRepository
               .findById(id)
               .map(cliente -> {
                   cliente.setNome(clienteAtualizado.getNome());
                   cliente.setCpf(clienteAtualizado.getCpf());
                   return clienteRepository.save(cliente);

               })
               .
               .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
   }
}
