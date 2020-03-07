package com.controle.estoque.service;

import com.controle.estoque.domain.Pedido;
import com.controle.estoque.repository.PedidoRepository;
import org.graalvm.compiler.replacements.PEGraphDecoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void cadastrarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public Iterable<Pedido> pedidoList (){
        return pedidoRepository.findAll();
    }
}
