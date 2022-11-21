package br.daniel.data;

import br.daniel.dao.CoordenadorDao;
import br.daniel.model.Coordenador;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCoordenador implements IRepositorioCoordenador{

    List<Coordenador> listaDeCoordenadores = new ArrayList<>();

    CoordenadorDao dao = new CoordenadorDao();


    @Override
    public boolean salvarCoordenador(Coordenador coordenador) {
        try{
            dao.salvarCoordenador(coordenador);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Erro no cadastro do coordenador");
        }
        return true;
    }

    @Override
    public List<Coordenador> listarCoordenador() {
        return dao.coordenadorList();
    }

    @Override
    public boolean deletarCoordenador(String cpf) {
        try{
            dao.deletarCoordenador(cpf);
        }catch (Exception e){
        e.printStackTrace();
        System.out.println("Erro ao deletar o coordenador");
    }
        return false;
}

    @Override
    public Coordenador buscarCoordenador(String cpf) {
        return null;
    }

    @Override
    public boolean alterarCoordenador(Coordenador coordenador) {


        return false;
    }
}
