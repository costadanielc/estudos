package br.atosdaniel.petshop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "pet")
@Table(name = "tb_pet")
public class Pet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="cod_pet")
    private Integer id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
/*
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
    })

    @JoinTable(name = "cliente",
        joinColumns = { @JoinColumn(name = "cod_pet")},
        inverseJoinColumns = { @JoinColumn(name = "cod_cliente") })
    private Set<Cliente> clientes = new HashSet<>();*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
