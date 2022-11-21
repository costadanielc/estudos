package com.costadanielc.cadastro.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Date;
@MappedSuperclass
public abstract class Pessoa {

    protected String  nome;
    protected String  cpf;
    @Column(name = "data_nascimento")
    protected Date    dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
