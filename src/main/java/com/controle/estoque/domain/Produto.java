package com.controle.estoque.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;
    private String nomeProduto;
    private String descricao;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itemPedidoList;


    public Produto(String nomeProduto, String descricao, List<ItemPedido> itemPedidoList) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.itemPedidoList = itemPedidoList;
    }

    public Produto() {
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }

    public void setItemPedidoList(List<ItemPedido> itemPedidoList) {
        this.itemPedidoList = itemPedidoList;
    }
}
