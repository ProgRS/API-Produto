package br.com.apiproduto.entity;



import lombok.Data;

import javax.persistence.*;
//import javax.persistence.Column;

import java.math.BigDecimal;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private BigDecimal valor;

    @Column
    private String descricao;
}
