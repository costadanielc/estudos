package br.daniel.view.controllerviews;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaCoordenadorControle implements ActionListener {

    JFrame frameMenuInicial;
    JFrame frameListar;

    public ListaCoordenadorControle(JFrame frameMenuInicial, JFrame frameListar) {
        super();
        this.frameMenuInicial = frameMenuInicial;
        this.frameListar = frameListar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frameListar.setVisible(false);
        frameMenuInicial.setVisible(true);

    }
}
