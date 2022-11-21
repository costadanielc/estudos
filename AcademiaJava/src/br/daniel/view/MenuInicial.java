package br.daniel.view;

import br.daniel.view.controllerviews.MenuInicialControle;

import javax.swing.*;

public class MenuInicial {

    public void apresentarMenuInicial(){
        String opcaoMenu = null;

        String menuInicialTexto     = "Menu Inicial";
        String opcaoUmMenuTexto     = "[1] Cadastro de Coordenador";
        String opcaoDoisMenuTexto   = "[2] Listar Cordenadores";
        String opcaoTresMenuTexto   = "[3] Deletar Coordenador";
        String opcaoQuatroMenuTexto = "[4] Alterar Coordenador";
        String opcaoCincoMenuTexto  = "[5] Encerrar";

        JFrame frameMenuInicial = new JFrame();
        frameMenuInicial.setSize(200, 230);
        frameMenuInicial.setTitle("Cadastro de Coordenador e Gerente");
        frameMenuInicial.setLocation(300,300);

        JPanel panelMenuInicial = new JPanel();

        JLabel menuInicialTextoLabel = new JLabel(menuInicialTexto);
        panelMenuInicial.add(menuInicialTextoLabel);

        JLabel opcaoUmMenuTextoLabel = new JLabel(opcaoUmMenuTexto);
        panelMenuInicial.add(opcaoUmMenuTextoLabel);

        JLabel opcaoDoisMenuTextoLabel = new JLabel(opcaoDoisMenuTexto );
        panelMenuInicial.add(opcaoDoisMenuTextoLabel);

        JLabel opcaoTresMenuTextoLabel = new JLabel(opcaoTresMenuTexto);
        panelMenuInicial.add(opcaoTresMenuTextoLabel);

        JLabel opcaoQuatroMenuTextoLabel = new JLabel(opcaoQuatroMenuTexto);
        panelMenuInicial.add(opcaoQuatroMenuTextoLabel);

        JLabel opcaoCincoMenuTextoLabel = new JLabel(opcaoCincoMenuTexto);
        panelMenuInicial.add(opcaoCincoMenuTextoLabel);

        JTextField opcaoMenuJTextField = new JTextField(10);
        panelMenuInicial.add(opcaoMenuJTextField);

        JButton botaoMenu = new JButton("Enviar");
        panelMenuInicial.add(botaoMenu);

        frameMenuInicial.add(panelMenuInicial);
        frameMenuInicial.setVisible(true);

        MenuInicialControle menuInicialControle = new MenuInicialControle(opcaoMenuJTextField,frameMenuInicial);

        botaoMenu.addActionListener(menuInicialControle);
    }
}
