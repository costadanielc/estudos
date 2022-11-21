package br.daniel.controller;

public interface IFuncionario {
    public String getNome();

    public void setNome(String nome);

    public Double getSalarioHora();

    public void setSalarioHora(Double salarioHora);

    public String getCpf();

    public void setCpf(String cpf);
    public Double calculaSalario(int salario);
}
