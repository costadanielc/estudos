package br.daniel.view;

import br.daniel.model.Coordenador;
import br.daniel.view.controllerviews.ListaCoordenadorControle;

import javax.swing.*;
import java.util.List;

public class ListarCoordenadores {

    public void apresentarLista(List<Coordenador> listaDeCoordenadores, JFrame frameMenuInicial) {

        int quantidadeDeLinhas = listaDeCoordenadores.size();
        int quantidadeDecolunas = 5;

        String [][] tabelaString = new String[quantidadeDeLinhas][quantidadeDecolunas];

        int posicaoLinha = 0;
        int posicaoColuna = 0;

        for (Coordenador coordenador: listaDeCoordenadores) {
            tabelaString [posicaoLinha][posicaoColuna] = coordenador.getNome();
            posicaoColuna++;

            tabelaString [posicaoLinha][posicaoColuna] = coordenador.getCpf();
            posicaoColuna++;

            tabelaString [posicaoLinha][posicaoColuna] = String.valueOf(coordenador.getSalarioHora());
            posicaoColuna++;

            tabelaString [posicaoLinha][posicaoColuna] = coordenador.getLoja();
            posicaoColuna++;

            tabelaString [posicaoLinha][posicaoColuna] = String.valueOf(coordenador.getMetaDaLoja());
            posicaoColuna = 0;
            posicaoLinha++;
        }

        String[] colunasTitulos = {"Nome", "Cpf", "SalarioHora", "Loja", "Meta da Loja"};

        JFrame frameListarCoordenadores = new JFrame();
        frameListarCoordenadores.setSize(500,600);

        JTable tabelaCoordenador = new JTable(tabelaString,colunasTitulos);
        tabelaCoordenador.setBounds(30,40,200,300);

        JScrollPane scrollPaneTabela = new JScrollPane(tabelaCoordenador);
        JPanel panelListarCoordenador = new JPanel();

        panelListarCoordenador.add(scrollPaneTabela);

        frameListarCoordenadores.add(panelListarCoordenador);
        frameListarCoordenadores.setVisible(true);

        JButton botaoVoltar = new JButton("Menu");
        panelListarCoordenador.add(botaoVoltar);

        ListaCoordenadorControle listaCoordenadorControle = new ListaCoordenadorControle(frameMenuInicial, frameListarCoordenadores);
        botaoVoltar.addActionListener(listaCoordenadorControle);
    }
}
