package Aula_02;

public class Coordenador extends Funcionario{

    private String loja;
    private Double metaDaLoja;

    public Coordenador(String _nome, Double _salarioLiquido, String _cpf){
        super(_nome, _salarioLiquido, _cpf);
    }

    public Coordenador(){
        
    }

    @Override
    public Double getSalario(){
        return this.salarioLiquido * 40 * 0.93;
    }
    
    public String getLoja(){
        return this.loja;
    }

    public void setLoja(String loja){
        this.loja  = loja;

    }

    public Double getMetaDaLoja(){
        return this.metaDaLoja;
    }

    public void setMetaDaLoja(Double metaDaLoja){
        this.metaDaLoja  = metaDaLoja;

    }
    
}
