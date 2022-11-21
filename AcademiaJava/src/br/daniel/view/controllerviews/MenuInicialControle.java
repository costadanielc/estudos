package br.daniel.view.controllerviews;

import br.daniel.data.RepositorioCoordenador;
import br.daniel.view.ListarCoordenadores;
import br.daniel.view.TelaRegistro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicialControle implements ActionListener {

    JTextField opcaoMenuJTextField;
    JFrame frameMenuInicial;

    ListarCoordenadores listarCoordenadores = new ListarCoordenadores();

    TelaRegistro telaRegistro = new TelaRegistro();

    TelaDeletar telaDeletar = new TelaDeletar();

    RepositorioCoordenador repositorioCoordenador = new RepositorioCoordenador();

    public MenuInicialControle() {

    }

    public MenuInicialControle(JTextField opcaoMenuJTextFieldCr,JFrame frameMenuInicialCr) {
        this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
        this.frameMenuInicial = frameMenuInicialCr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || opcaoMenuJTextField.getText().equals("3") ||
                opcaoMenuJTextField.getText().equals("4") || opcaoMenuJTextField.getText().equals("5")){

            frameMenuInicial.setVisible(false);

            switch (opcaoMenuJTextField.getText()) {
                case "1":
                    telaRegistro.registrarFuncionario(opcaoMenuJTextField, frameMenuInicial, repositorioCoordenador);
                    System.out.println("Cadastre o Coordenador!");
                    break;

                case "2":
                    listarCoordenadores.apresentarLista(repositorioCoordenador.listarCoordenador(), frameMenuInicial);
                    System.out.println("Lista Coordenadores");
                    break;

                case "3":
                    telaDeletar.deletarCoordenador(frameMenuInicial, repositorioCoordenador);
                    System.out.println("Deletar Coordenador");
                    break;

                case "4":
                    System.out.println("Alterar Coordenador");
                    break;

                case "5":
                    System.out.println("Encerrar programa");
                    break;
            }
        }else {
            System.out.println("Opção Invalida!!");
        }
    }
}
