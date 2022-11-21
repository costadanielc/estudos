package br.atosdaniel.petshop.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cuidador")
public class Cuidador {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="cod_cuidador")
    private Integer id;
    private String matricula;
    private String nome;

    private List<Jaula> jaulas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
