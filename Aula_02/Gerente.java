package Aula_02;

public class Gerente extends Funcionario{

    private String regional;
    private Double metaRegional;

    public Gerente(String _nome, Double _salarioLiquido, String _cpf){
        super(_nome, _salarioLiquido, _cpf);
    }

    public Gerente(){
        
    }

    @Override
    public Double getSalario(){
        return this.salarioLiquido * 60 * 0.85;
    }
    
    public String getRegional(){
        return this.regional;
    }

    public void setRegional(String regional){
        this.regional  = regional;

    }

    public Double getMetaRegional(){
        return this.metaRegional;
    }

    public void setMetaRegional(Double metaRegional){
        this.metaRegional  = metaRegional;

    }
}
