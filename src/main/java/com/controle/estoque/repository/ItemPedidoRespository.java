package com.controle.estoque.repository;

import com.controle.estoque.domain.ItemPedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRespository extends CrudRepository<ItemPedido, Long> {

}
