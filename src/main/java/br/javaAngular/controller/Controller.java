package br.javaAngular.controller;


import br.javaAngular.model.Cliente;
import br.javaAngular.model.Mensagem;
import br.javaAngular.repository.Repositorio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Repositorio acao;

    @PostMapping("/cadastrar")
    @Operation(summary = "Rota responsável pelo cadastro de pessoas")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Pessoa cadastrada com sucesso",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Cliente.class)
                            )
                    }
            ),

            @ApiResponse(
                    responseCode = "400",
                    description = "Informação inválida",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Mensagem.class)
                            )
                    }
            )
    })
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }

    @GetMapping("/listar")
    @Operation(summary = "Rota responsável pelo listagem de pessoas")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Listagem de pessoas",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Cliente.class)
                            )
                    }
            )
    })
    public List<Cliente> listarPessoas(){

        // Retornar a lista de pessoas cadastradas
        return this.acao.findAll();

    }


    @PutMapping("/editar")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);
    }

    @DeleteMapping("/deletar/{id}")
    public void remover(@PathVariable long id){
        acao.deleteById(id);
    }




}
