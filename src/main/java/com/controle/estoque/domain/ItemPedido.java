package com.controle.estoque.domain;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "itempedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOrdemCompra;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    private String dataOrdemCompra;

    private long quantidade;

    public ItemPedido(Pedido pedido, Produto produto, String dataOrdemCompra, long quantidade) {
        this.pedido = pedido;
        this.produto = produto;
        this.dataOrdemCompra = dataOrdemCompra;
        this.quantidade = quantidade;
    }

    public ItemPedido() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getDataOrdemCompra() {
        return dataOrdemCompra;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setDataOrdemCompra(String dataOrdemCompra) {
        this.dataOrdemCompra = dataOrdemCompra;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
}
