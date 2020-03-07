package com.controle.estoque.controller;


import com.controle.estoque.domain.Pedido;
import com.controle.estoque.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity receberpedido(@RequestBody Pedido pedido){

        pedidoService.cadastrarPedido(pedido);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity retornarPedidos(){

       return ResponseEntity.status(HttpStatus.OK).body(pedidoService.pedidoList());

    }

}
