package Aula_01;

public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    public Professor(String _nomeCompleto, String _cpf){
        super(_nomeCompleto, _cpf);

    }

    public String getDisciplina(){
        return disciplina;
    }

    public double getSalario(){
        return salario;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }


    
}
