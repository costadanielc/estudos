package com.costadanielc.cadastro.model;

import javax.persistence.*;

@Entity
@Table(name = "titular")
public class Titular extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String profissao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
