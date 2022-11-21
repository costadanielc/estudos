package br.daniel.programadores.model;

import javax.persistence.*;

@Entity
@Table(name = "programador")
public class Programador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private double salario;
    private int idade;

    public Programador(long id, String nome, double salario, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public Programador() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
