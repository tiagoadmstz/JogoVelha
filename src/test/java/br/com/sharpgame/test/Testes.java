package br.com.sharpgame.test;


import br.com.sharpgame.util.SharpGameUtil;
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tiago
 */
public class Testes {

    @Test
    public void verificarLinha1() {
        SharpGameUtil util = new SharpGameUtil();
        //teste linha 0
        boolean resultado = util.conferirResultado(new int[][]{{1, 1, 1}, {0, 0, 0}, {0, 0, 0}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

    @Test
    public void verificarLinha2() {
        SharpGameUtil util = new SharpGameUtil();
        //teste linha 2
        boolean resultado = util.conferirResultado(new int[][]{{0, 0, 0}, {0, 0, 0}, {2, 2, 2}}, SharpGameUtil.JOGADOR_2);
        assertTrue(resultado);
    }

    @Test
    public void verificarLinha3() {
        SharpGameUtil util = new SharpGameUtil();
        //teste linha 3
        boolean resultado = util.conferirResultado(new int[][]{{0, 0, 0}, {0, 0, 0}, {1, 1, 1}}, SharpGameUtil.JOGADOR_2);
        assertFalse(resultado);
    }

    @Test
    public void verificarColuna1() {
        SharpGameUtil util = new SharpGameUtil();
        //teste coluna 1
        boolean resultado = util.conferirResultado(new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 0, 0}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

    @Test
    public void verificarColuna2() {
        SharpGameUtil util = new SharpGameUtil();
        //teste coluna 2
        boolean resultado = util.conferirResultado(new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 0}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

    @Test
    public void verificarColuna3() {
        SharpGameUtil util = new SharpGameUtil();
        //teste coluna 3
        boolean resultado = util.conferirResultado(new int[][]{{0, 0, 1}, {0, 0, 1}, {0, 0, 1}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

    @Test
    public void verificarDiagonal1() {
        SharpGameUtil util = new SharpGameUtil();
        //teste diagonal 1
        boolean resultado = util.conferirResultado(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

    @Test
    public void verificarDiagonal2() {
        SharpGameUtil util = new SharpGameUtil();
        //teste diagonal 2
        boolean resultado = util.conferirResultado(new int[][]{{0, 0, 1}, {0, 1, 0}, {1, 0, 0}}, SharpGameUtil.JOGADOR_1);
        assertTrue(resultado);
    }

}
