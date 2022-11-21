package Aula_01;

public class Pessoa {
    private String nomeCompleto;
    private String cpf;

    public Pessoa(String _nomeCompleto, String _cpf){
        this.nomeCompleto = _nomeCompleto;
        this.cpf = _cpf;

    }

    
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }    


}