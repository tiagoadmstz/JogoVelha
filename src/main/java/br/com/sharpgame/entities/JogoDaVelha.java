/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sharpgame.entities;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
// RAISSA HONORATO PONTES - REDES DE COMPUTADORES - 20141380300
public class JogoDaVelha {

    private Jogador[] jogadores = new Jogador[2];
    private int[][] matriz = new int[3][3];
    private List<String> historico = new ArrayList();
    private int linha = -1, coluna = -1, turno = -1;

    /**
     * Construtor do controlador do jogo. Caso o segundo jogador seja nulo
     * a máquina assumira o controle.
     *
     * @param jogador_1 Nome do primeiro jogador
     * @param jogador_2 Nome do segundo jogador
     */
    public JogoDaVelha(Jogador jogador_1, Jogador jogador_2) {
        if(jogador_1 != null){
            jogadores[0] = jogador_1;
        }
        if(jogador_2 != null){
            jogadores[1] = jogador_2;
        } else {
            jogadores[1] = new Jogador("Máquina");
        }
    }

    /**
     * Retorna um jogador
     *
     * @param jogador Número correspondente ao jogador
     * @return Jogador selecionado
     */
    public String getNomeJogador(int jogador) {
        return jogadores[SharpGameUtil.JOGADOR_1 - 1].getNome();
    }

    /**
     * Retorna posição linha da última jogada
     */
    public int getUltimaLinha() {
        return 0;
    }

    /**
     * Retorna posição coluna da última jogada
     */
    public  int  getUltimaColuna() {
        return 0;
    }

    /**
     * Retorna o número do jogador da última jogada realizada
     *
     * @return
     */
    public  int  getUltimoJogador() {
        return turno;
    }

}
