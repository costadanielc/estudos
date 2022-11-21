package br.daniel.view.controllerviews;

import br.daniel.data.RepositorioCoordenador;
import br.daniel.model.Coordenador;

import javax.swing.*;

public class TelaDeletar {

    public void deletarCoordenador(JFrame menuInicialFrame, RepositorioCoordenador repositorioCoordenador){
        int quantidadeDeLinhas = repositorioCoordenador.listarCoordenador().size();
        int quantidadeDeColunas = 5;

        String stringTextDeletar = "Informe o cpf que deseja deletar";

        String[][] tabelaString = new String[quantidadeDeLinhas][quantidadeDeColunas];

        int posicaoLinha = 0;
        int posicaoColuna = 0;

        for (Coordenador coordenador: repositorioCoordenador.listarCoordenador()){
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

        String[] colunasTitulos = {"Nome", "Cpf", "SalarioHora", "Loja", "MetaDaLoja"};

        //Cria o frame (janela)
        JFrame frameListarCoordenador = new JFrame();
        frameListarCoordenador.setSize(500,600);

        //Cria o objeto do tipo tabela (interface grafica)
        JTable tabelaCoordenador = new JTable(tabelaString,colunasTitulos);
        tabelaCoordenador.setBounds(30,40,200,300);

        //Scroll
        JScrollPane scrollPaneTabela = new JScrollPane(tabelaCoordenador);
        JPanel panelListarCoordenador = new JPanel();

        JLabel stringTextoDeletarLabel = new JLabel(stringTextDeletar);
        panelListarCoordenador.add(stringTextoDeletarLabel);

        JTextField cpfTextField = new JTextField(10);
        panelListarCoordenador.add(cpfTextField);

        JButton botaoDeletar = new JButton("Deletar");
        panelListarCoordenador.add(botaoDeletar);


        // Adiciona o scroll pane no painel
        panelListarCoordenador.add(scrollPaneTabela);

        // Adiciona o painel no frame e habilita a visibilidade do frame
        frameListarCoordenador.add(panelListarCoordenador);
        frameListarCoordenador.setVisible(true);

        TelaDeletarControle telaDeletarControle = new TelaDeletarControle(frameListarCoordenador, menuInicialFrame, cpfTextField, repositorioCoordenador);
        botaoDeletar.addActionListener(telaDeletarControle);

    }
}
