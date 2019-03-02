/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sharpgame.entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Tiago
 */
public class SharpGameUtil {

    public static final Integer JOGADOR_1 = 1, JOGADOR_2 = 2;

    public SharpGameUtil() {
    }

    /**
     * Conferi o resultado do jogo rastreando os valores na matriz
     *
     * @param matriz Matriz 3x3
     * @param jogador Número do Jogador
     * @return Retorna se um jogador fez 3 pontos nas posições possíveis
     */
    public boolean conferirResultado(int[][] matriz, int jogador) {
        if (matriz.length == 3) {
            if (matriz[0].length == 3) {
                int s = jogador;
                for (int x = 0; x < 3; x++) {
                    //verifica linhas
                    if (s == matriz[x][0] && s == matriz[x][1] && s == matriz[x][2]) {
                        return true;
                    }
                    //verifica colunas
                    if (s == matriz[0][x] && s == matriz[1][x] && s == matriz[2][x]) {
                        return true;
                    }
                }
                //verifica diagonal
                if (s == matriz[0][0] && s == matriz[1][1] && s == matriz[2][2]) {
                    return true;
                } else if (s == matriz[2][0] && s == matriz[1][1] && s == matriz[0][2]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /**
     * Grava o resultado do jogo em um arquivo de texto
     *
     * @param resultado
     */
    public void gravarResultado(String resultado) {
        try {
            File file = new File(System.getProperty("user.dir").concat("/HistoricoJogo.txt"));
            FileWriter write = new FileWriter(file);
            write.write(resultado.concat("\n"));
            write.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na hora de gravar o aquivo.");
            e.printStackTrace();
        }
    }

    /**
     * Zera todos os campos da matriz
     *
     * @param matriz Matriz 3x3
     */
    public void resetarJogo(int[][] matriz) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = 0;
            }
        }
    }

    /**
     * Faz a jogada se o local na matriz estiver vazio
     *
     * @param jogador Número de identificação do jogador
     * @param matriz
     * @param linha Linha selecionada
     * @param coluna Coluna selecionada
     * @return Verdadeiro se a jogada foi aceita e falso se não.
     */
    public boolean fazerJogada(Jogador jogador, int[][] matriz, int linha, int coluna) {
        int valor = matriz[linha][coluna];
        System.out.println(valor);
        return false;
    }

    /**
     * Faz uma jogada aleatória em uma matriz 3x3
     *
     * @param matriz
     * @param jogador
     */
    public void jogadaAleatoria(int[][] matriz, int jogador) {
        Random r = new Random();
        int l = r.nextInt(2);
        int c = r.nextInt(2);
        matriz[l][c] = jogador;
    }
}
