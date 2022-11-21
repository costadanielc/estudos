package br.atosdaniel.petshop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class Jaula implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="cod_jaula")
    private int idJaula;
    private String nomeZoologico;
    private String bloco;



    @ManyToMany(mappedBy = "jaulas")
    private List<Jaula> jaulas;

    public int getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(int idJaula) {
        this.idJaula = idJaula;
    }

    public String getNomeZoologico() {
        return nomeZoologico;
    }

    public void setNomeZologico(String nomeZoologico) {
        this.nomeZoologico = nomeZoologico;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
