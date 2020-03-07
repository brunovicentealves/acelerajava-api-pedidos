package com.controle.estoque.dto;

public class ItemPedidoDTO {

        private long idPedido;
        private long idProduto;
        private Long quantidadeItemPedido;
        private String dataOrdemCompra;

    public ItemPedidoDTO(long idPedido, long idProduto, Long quantidadeItemPedido, String dataItemPedido) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidadeItemPedido = quantidadeItemPedido;
        this.dataOrdemCompra = dataItemPedido;
    }

    public long getIdPedido() {
            return idPedido;
        }

        public void setIdPedido(long idPedido) {
            idPedido = idPedido;
        }

        public long getIdProduto() {
            return idProduto;
        }

        public void setIdProduto(long idProduto) {
            this.idProduto = idProduto;
        }

        public Long getQuantidadeItemPedido() {
            return quantidadeItemPedido;
        }

        public void setQuantidadeItemPedido(Long quantidadeItemPedido) {
            this.quantidadeItemPedido = quantidadeItemPedido;
        }

        public String getDataOrdemCompra() {
        return dataOrdemCompra;
    }

    public void setDataOrdemCompra(String dataOrdemCompra) {
        this.dataOrdemCompra = dataOrdemCompra;
    }
}
