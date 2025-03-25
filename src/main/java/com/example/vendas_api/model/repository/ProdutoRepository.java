package com.example.vendas_api.model.repository;


import com.example.vendas_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
