package Aula_02;

public abstract class Funcionario {
    public String nome;
    public Double salarioLiquido;
    public String cpf;

    public Funcionario(String _nome, Double _salarioLiquido, String _cpf){
        this.nome = _nome;
        this.salarioLiquido = _salarioLiquido;
        this.cpf = _cpf;

    }

    public Funcionario(){
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome  = nome;

    }

    public Double getSalario(){
        return this.salarioLiquido;
    }
    
    public void setSalario(Double salario){
        this.salarioLiquido  = salario;

    }

    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf  = cpf;

    }    
}
