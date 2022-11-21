package br.daniel.view.controllerviews;

import br.daniel.data.RepositorioCoordenador;
import br.daniel.model.Coordenador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRegistroControle implements ActionListener {

    JFrame frameTelaRegistro;
    JFrame frameMenuInicial;

    JTextField nomeTextField;
    JTextField cpfTextField;
    JTextField salarioHoraTextField;

    JTextField lojaTextField;
    JTextField metaDaLojaTextField;


    //Inicia o repositório para a minha aplicação
    RepositorioCoordenador repositorioCoordenador;

    boolean validarSalvar = false;

    public TelaRegistroControle(JFrame frameTelaRegistro, JFrame frameMenuInicial, JTextField nomeTextField,
                                JTextField cpfTextField, JTextField salarioHoraTextField, JTextField lojaTextField,
                                JTextField metaDaLojaTextField, RepositorioCoordenador repositorioCoordenador) {
        super();
        this.frameTelaRegistro = frameTelaRegistro;
        this.frameMenuInicial = frameMenuInicial;
        this.nomeTextField = nomeTextField;
        this.cpfTextField = cpfTextField;
        this.salarioHoraTextField = salarioHoraTextField;
        this.repositorioCoordenador = repositorioCoordenador;
        this.lojaTextField = lojaTextField;
        this.metaDaLojaTextField = metaDaLojaTextField;
    }

    public TelaRegistroControle() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        acionarSalvar();
        frameMenuInicial.setVisible(true);
        frameTelaRegistro.setVisible(false);

    }

    private void acionarSalvar() {
        Coordenador coordenador = new Coordenador();

        coordenador.setNome(nomeTextField.getText());
        coordenador.setCpf(cpfTextField.getText());
        coordenador.setSalarioHora(Double.valueOf(salarioHoraTextField.getText()));
        coordenador.setLoja(lojaTextField.getText());
        coordenador.setMetaDaLoja(Double.valueOf(metaDaLojaTextField.getText()));

        validarSalvar = repositorioCoordenador.salvarCoordenador(coordenador);

        if (validarSalvar) {
            System.out.println(coordenador.getNome() + " Foi Registrado com sucesso!");
        } else {
            System.out.println("Erro durante o cadastro");
        }
    }
}
