package com.controle.estoque.repository;

import com.controle.estoque.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long> {

}
