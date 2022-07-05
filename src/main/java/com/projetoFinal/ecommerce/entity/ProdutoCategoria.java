package com.projetoFinal.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="produto_categoria")
// @Data -- known bug
@Getter
@Setter
public class ProdutoCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "categoria_nome")
    private String categoria_nome;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private Set<Produto> produtos;

}







