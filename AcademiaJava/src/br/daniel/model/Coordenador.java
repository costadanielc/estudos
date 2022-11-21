package br.daniel.model;

public class Coordenador extends Funcionario{

    private String loja;
    private Double metaDaLoja;

    public Coordenador(String nome, Double salarioHora, String cpf, String loja, Double metaDaLoja) {
        super(nome, salarioHora, cpf);
        this.loja = loja;
        this.metaDaLoja = metaDaLoja;
    }

    public Coordenador() {

    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Double getMetaDaLoja() {
        return metaDaLoja;
    }

    public void setMetaDaLoja(Double metaDaLoja) {
        this.metaDaLoja = metaDaLoja;
    }

    @Override
    public Double calculaSalario(int horasTrabalhadas) {
        return this.salarioHora * horasTrabalhadas;
    }


    public String mostraDados() {
        return "Nome: " + super.nome + '\'' +
                "CPF " + super.cpf + '\'' +
                "Salário hora: " + super.salarioHora + '\'' +
                "Loja " + loja + '\'' +
                "Meta da Loja" + metaDaLoja + '\'';
    }
}
