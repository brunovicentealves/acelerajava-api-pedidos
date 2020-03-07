package com.controle.estoque.controller;

import com.controle.estoque.domain.Produto;
import com.controle.estoque.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity receberProduto(@RequestBody Produto produto){
        produtoService.cadastrarProduto(produto);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }


    @GetMapping

    public ResponseEntity  retornarProdutos (){
      return ResponseEntity.status(HttpStatus.OK).body(produtoService.produtoList());
    }



}
