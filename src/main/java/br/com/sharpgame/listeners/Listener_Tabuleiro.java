/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sharpgame.listeners;

import br.com.sharpgame.entities.Jogador;
import br.com.sharpgame.util.SharpGameUtil;
import br.com.sharpgame.frames.Form_Tabuleiro;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Tiago
 */
public class Listener_Tabuleiro implements ActionListener {

    private final SharpGameUtil util;
    private final Form_Tabuleiro form;
    private final int[][] matriz;

    public Listener_Tabuleiro(Form_Tabuleiro form) {
        this.form = form;
        this.util = new SharpGameUtil();
        this.matriz = new int[3][3];
        initComponents();
    }

    private void initComponents() {
        attachListener();

    }

    private void attachListener() {
        form.getButtonsList().forEach(bt -> bt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                JButton bt = (JButton) event.getSource();
                //bt.setBackground(Color.green);
                //bt.setText("X");
                jogar();
            }
        }));
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case "button":
                jogar();
                break;
        }
    }

    private void jogar() {
        Jogador j = new Jogador("Tiago", "X");
        j.setVitorias(0);
        util.fazerJogada(j, matriz, 0, 0);
    }

}
