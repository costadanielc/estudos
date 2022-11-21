package br.daniel.view.controllerviews;

import br.daniel.data.RepositorioCoordenador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeletarControle implements ActionListener {

    JFrame frameListarCoordenador;
    JFrame menuInicialFrame;
    JTextField cpfField;
    RepositorioCoordenador repositorioCoordenador;

    boolean validaDelete;

    public TelaDeletarControle(JFrame frameListarCoordenador, JFrame menuInicialFrame, JTextField cpfField, RepositorioCoordenador repositorioCoordenador) {
        this.frameListarCoordenador = frameListarCoordenador;
        this.menuInicialFrame = menuInicialFrame;
        this.cpfField = cpfField;
        this.repositorioCoordenador = repositorioCoordenador;
    }

    public TelaDeletarControle(){};

    @Override
    public void actionPerformed(ActionEvent e) {
        validaDelete = repositorioCoordenador.deletarCoordenador(cpfField.getText());

        if(validaDelete){
            JOptionPane.showMessageDialog(null, "Coordenador Deletado com Sucesso");
            menuInicialFrame.setVisible(true);
            frameListarCoordenador.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null, "Coordenador não encontrado");
            menuInicialFrame.setVisible(true);
            frameListarCoordenador.setVisible(false);
        }
    }


}
