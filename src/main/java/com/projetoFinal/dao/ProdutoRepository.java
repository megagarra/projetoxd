package com.projetoFinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetoFinal.ecommerce.entity.Produto;

@CrossOrigin("http://localhost:4200")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
