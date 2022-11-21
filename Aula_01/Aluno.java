package Aula_01;

public class Aluno extends Pessoa {
    private String advertencia;
    private String turma;

    public Aluno(String _nomeCompleto, String _cpf){
        super(_nomeCompleto, _cpf);

    }

    
    public String getAdvertencia(){
        return advertencia;
    }

    public String getTurma(){
        return turma;
    }

    public void setAdvertencia(String advertencia){
        this.advertencia = advertencia;
    }

    public void setTurma(String turma){
        this.turma = turma;
    }    


}