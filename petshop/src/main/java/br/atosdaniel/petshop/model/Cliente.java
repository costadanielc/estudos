package br.atosdaniel.petshop.model;

import javax.persistence.*;


@Entity (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="cod_cliente")
    private Integer id;
    private String nome;
    private String cpf;
    private int idade;

    @Embedded
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer cod_cliente) {
        this.id = cod_cliente;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
