package br.daniel.data;

import br.daniel.model.Coordenador;

import java.util.List;

public interface IRepositorioCoordenador {

    public boolean salvarCoordenador(Coordenador coordenador);
    public List<Coordenador> listarCoordenador();
    public boolean deletarCoordenador(String cpf);
    public Coordenador buscarCoordenador(String cpf);
    public boolean alterarCoordenador(Coordenador coordenador);

}
