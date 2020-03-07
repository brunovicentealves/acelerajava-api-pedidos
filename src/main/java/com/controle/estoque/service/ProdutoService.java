package com.controle.estoque.service;

import com.controle.estoque.domain.Produto;
import com.controle.estoque.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void cadastrarProduto(Produto produto) {
        produtoRepository.save(produto);

    }

    public Iterable<Produto> produtoList (){
        return produtoRepository.findAll();
    }
}
