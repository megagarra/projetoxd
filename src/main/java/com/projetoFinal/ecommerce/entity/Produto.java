package com.projetoFinal.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="produto")
@Data 
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private ProdutoCategoria categoria;

    @Column(name = "sku")
    private String sku;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco_unidade")
    private BigDecimal preco_unidade;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "ativo")
    private boolean ativo;

    @Column(name = "unidades_em_estoque")
    private int unidades_em_estoque;

    @Column(name = "data_criacao")
    @CreationTimestamp
    private Date data_criacao;

    @Column(name = "ultima_atualizacao")
    @UpdateTimestamp
    private Date ultima_atualizacao;
}
