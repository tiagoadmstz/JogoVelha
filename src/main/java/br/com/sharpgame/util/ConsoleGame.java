/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sharpgame.util;

import br.com.sharpgame.entities.Jogador;
import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class ConsoleGame {

    private final Scanner scan;
    private final int[][] matriz;
    private final SharpGameUtil util;
    private final Jogador[] jogadores;
    private int jogador_atual = 0;
    private String tabuleiro = "";

    public ConsoleGame() {
        scan = new Scanner(System.in);
        jogadores = new Jogador[2];
        matriz = new int[3][3];
        util = new SharpGameUtil();
    }

    public void startGame() {
        printTitle();
        menuInicial();
        printMatriz();
        jogar(2);
        printMatriz();
    }

    private void printTitle() {
        String start = "----------------------------- Jogo da Velha ------------------------------\n"
                + "       _     _        _______   _______   __     __   ________  \n"
                + "  __ /  /__/  /_     |  _____| |  ___  | |  \\   /  | |  ______|\n"
                + " /__    __   __/     | |  ___  | |___| | | |\\\\_//| | | |___\n"
                + " __/  /__/  /__      | | |_  | |  ___  | | | \\_/ | | |  ___|\n"
                + "/_   __    ___/      | |___| | | |   | | | |     | | | |______\n"
                + " /_ /  /_ /          |_______| |_|   |_| |_|     |_| |________|  \n"
                + "\n"
                + "------------------------------- versão 0.0 -------------------------------\n";
        System.out.println(start);
    }

    private int menuInicial() {
        System.out.print("\n*Menu Inicial\n"
                + "1 - Iniciar jogo \n"
                + "2 - Fechar \n"
                + "Escolha > ");
        jogadores[0] = new Jogador("Jogador 1", "X");
        jogadores[1] = new Jogador("Jogador 2", "O");
        return scan.nextInt();
    }

    private void printMatriz() {
        if (tabuleiro.equals("")) {
            tabuleiro = "\n   1  |  2  |  3  \n"
                    + " -----|-----|-----\n"
                    + "   4  |  5  |  6  \n"
                    + " -----|-----|-----\n"
                    + "   7  |  8  |  9  \n";
        }
        System.out.println(tabuleiro);
    }

    private void jogar(int celula) {
        Jogador jog = jogadores[jogador_atual];
        switch (celula) {
            case 1:
                util.fazerJogada(jog, matriz, jogador_atual, jogador_atual);
                break;
        }
        tabuleiro = tabuleiro.replace(String.valueOf(celula), jog.getSimbolo());
    }

}
