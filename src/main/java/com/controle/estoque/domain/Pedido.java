package com.controle.estoque.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;
    private String dataPedido;
    private String origemPedido;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itemPedidoList;

    public Pedido(String dataPedido, String origemPedido) {
        this.dataPedido = dataPedido;
        this.origemPedido = origemPedido;

    }

    public Pedido() {
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getOrigemPedido() {
        return origemPedido;
    }

    public void setOrigemPedido(String origemPedido) {
        this.origemPedido = origemPedido;
    }

    public List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }

    public void setItemPedidoList(List<ItemPedido> itemPedidoList) {
        this.itemPedidoList = itemPedidoList;
    }
}
