package br.daniel.view;

import br.daniel.data.RepositorioCoordenador;
import br.daniel.view.controllerviews.TelaRegistroControle;

import javax.swing.*;

public class TelaRegistro {

    public void registrarFuncionario(JTextField opcaoMenuJText, JFrame frameMenuInicial, RepositorioCoordenador repositorioCoordenador) {

        String nomeTexto = "Digite o nome do Coordenador:";
        String cpfTexto = "Digite o CPF:";
        String salarioHoraTexto = "Digite o Salário Hora:";
        String lojaTexto = "Digite a Loja:";
        String metaDaLojaTexto = "Digite a Meta da Loja:";

        JFrame frameTelaRegistro = new JFrame();
        frameTelaRegistro.setSize(200, 230);
        frameTelaRegistro.setTitle("Inserir Programador");
        frameTelaRegistro.setLocation(300,300);

        JPanel painelTelaRegistro = new JPanel();

        JLabel nomeTextoLabel = new JLabel(nomeTexto );
        painelTelaRegistro.add(nomeTextoLabel);

        JTextField nomeTextField = new JTextField(10);
        painelTelaRegistro.add(nomeTextField);

        JLabel cpfTextoLabel = new JLabel(cpfTexto);
        painelTelaRegistro.add(cpfTextoLabel);

        JTextField cpfTextField = new JTextField(10);
        painelTelaRegistro.add(cpfTextField);

        JLabel salarioHoraTextoLabel = new JLabel(salarioHoraTexto);
        painelTelaRegistro.add(salarioHoraTextoLabel);

        JTextField salarioHoraTextField = new JTextField(10);
        painelTelaRegistro.add(salarioHoraTextField);

        JLabel lojaTextoLabel = new JLabel(lojaTexto);
        painelTelaRegistro.add(lojaTextoLabel);

        JTextField lojaTextField = new JTextField(10);
        painelTelaRegistro.add(lojaTextField);

        JLabel metaDaLojaTextoLabel = new JLabel(metaDaLojaTexto);
        painelTelaRegistro.add(metaDaLojaTextoLabel);

        JTextField metaDaLojaTextField = new JTextField(10);
        painelTelaRegistro.add(metaDaLojaTextField);

        JButton botaoCadastrar = new JButton("Registrar");
        painelTelaRegistro.add(botaoCadastrar);

        frameTelaRegistro.add(painelTelaRegistro);

        frameTelaRegistro.setVisible(true);

        TelaRegistroControle telaRegistroControle = new TelaRegistroControle(frameTelaRegistro, frameMenuInicial, nomeTextField, cpfTextField, salarioHoraTextField, lojaTextField,metaDaLojaTextField, repositorioCoordenador);
        botaoCadastrar.addActionListener(telaRegistroControle);
    }
}


