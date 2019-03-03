/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sharpgame.entities;

import java.awt.Color;

/**
 *
 * @author Tiago
 */
public class Jogador {

    private String nome;
    private int vitorias;
    private String simbolo;
    private Color color;

    public Jogador(String nome, String simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
        vitorias = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", vitorias=" + vitorias + ", simbolo=" + simbolo + ", color=" + color + '}';
    }
    
}
