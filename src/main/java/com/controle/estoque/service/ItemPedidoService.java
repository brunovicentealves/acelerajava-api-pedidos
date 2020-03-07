package com.controle.estoque.service;

import com.controle.estoque.domain.ItemPedido;
import com.controle.estoque.domain.Pedido;
import com.controle.estoque.domain.Produto;
import com.controle.estoque.dto.ItemPedidoDTO;
import com.controle.estoque.repository.ItemPedidoRespository;
import com.controle.estoque.repository.PedidoRepository;
import com.controle.estoque.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemPedidoService {

    private ItemPedidoRespository itemPedidoRespository;
    private ProdutoRepository produtoRepository;
    private PedidoRepository pedidoRepository;

    public ItemPedidoService(ItemPedidoRespository itemPedidoRespository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository ) {
        this.itemPedidoRespository = itemPedidoRespository;
        this.produtoRepository= produtoRepository;
        this.pedidoRepository=pedidoRepository;
    }

    public void cadastrarOrdemCompra(ItemPedidoDTO itemPedidoDTO) {
        ItemPedido itemPedido = new ItemPedido();

        Long iDproduto = itemPedidoDTO.getIdProduto();
        Optional<Produto> produto = produtoRepository.findById(iDproduto);
        itemPedido.setProduto(produto.get());
        Long iDpedido = itemPedidoDTO.getIdPedido();
        Optional<Pedido> pedido = pedidoRepository.findById(iDpedido);
        itemPedido.setQuantidade(itemPedidoDTO.getQuantidadeItemPedido());
        itemPedido.setDataOrdemCompra(itemPedidoDTO.getDataOrdemCompra());

        if(pedido.isPresent()) {
            itemPedido.setPedido(pedido.get());
        }else{
            System.out.println("voce passou valor errado");
        }



        //itemPedido.setPedido((pedidoRepository.findById(ordemCompraDto.getIdPedido()).get()));
        itemPedidoRespository.save(itemPedido);
    }
    public Iterable<ItemPedido> ordemComprasList (){
        return itemPedidoRespository.findAll();
    }
}
