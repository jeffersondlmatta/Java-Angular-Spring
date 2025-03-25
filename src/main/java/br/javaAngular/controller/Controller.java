package br.javaAngular.controller;


import br.javaAngular.model.Cliente;
import br.javaAngular.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private Repositorio acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c) {

        return acao.save(c);

    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar()
    {
       return acao.findAll();
    }



}
