package com.grm.jockeypow;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JogoTest {
    private final Jogo jogo = new Jogo(new Random());

    @Test
    public void pedraVenceTesoura() {
        assertEquals(Resultado.VITORIA, jogo.avaliar(Escolha.PEDRA, Escolha.TESOURA));
    }

    @Test
    public void papelVencePedra() {
        assertEquals(Resultado.VITORIA, jogo.avaliar(Escolha.PAPEL, Escolha.PEDRA));
    }

    @Test
    public void tesouraVencePapel() {
        assertEquals(Resultado.VITORIA, jogo.avaliar(Escolha.TESOURA, Escolha.PAPEL));
    }

    @Test
    public void derrotaQuandoComputadorVence() {
        assertEquals(Resultado.DERROTA, jogo.avaliar(Escolha.TESOURA, Escolha.PEDRA));
    }

    @Test
    public void empateQuandoEscolhasSaoIguais() {
        assertEquals(Resultado.EMPATE, jogo.avaliar(Escolha.PAPEL, Escolha.PAPEL));
    }

    @Test
    public void escolhaDoComputadorPertenceAoJogo() {
        Escolha escolha = jogo.escolherComputador();

        assertNotNull(escolha);
        assertTrue(escolha instanceof Escolha);
    }
}
