package br.daniel.model;

import br.daniel.controller.IFuncionario;

public abstract class Funcionario implements IFuncionario {

    public String nome;
    public Double salarioHora;
    public String cpf;

    public Funcionario(String nome, Double salarioHora, String cpf) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.cpf = cpf;
    }

    public Funcionario() {
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
