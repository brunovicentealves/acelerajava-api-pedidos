package com.controle.estoque.controller;

import com.controle.estoque.dto.ItemPedidoDTO;
import com.controle.estoque.service.ItemPedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itempedido")
public class ItemPedidoController {

    private ItemPedidoService itemPedidoService;

    public ItemPedidoController(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @PostMapping
    public ResponseEntity  recebeOrdemCompra(@RequestBody ItemPedidoDTO itemPedidoDTO){

        itemPedidoService.cadastrarOrdemCompra(itemPedidoDTO);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity retornaOrdemCompra(){
        return ResponseEntity.status(HttpStatus.OK).body(itemPedidoService.ordemComprasList());
    }
}
