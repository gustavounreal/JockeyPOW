package com.grm.jockeypow;

import java.util.Objects;
import java.util.Random;

public class Jogo {
    private final Random random;

    public Jogo() {
        this(new Random());
    }

    Jogo(Random random) {
        this.random = Objects.requireNonNull(random, "random não pode ser nulo");
    }

    public Escolha escolherComputador() {
        Escolha[] escolhas = Escolha.values();
        return escolhas[random.nextInt(escolhas.length)];
    }

    public Resultado avaliar(Escolha escolhaUsuario, Escolha escolhaComputador) {
        Objects.requireNonNull(escolhaUsuario, "escolha do usuário não pode ser nula");
        Objects.requireNonNull(escolhaComputador, "escolha do computador não pode ser nula");

        if (escolhaUsuario == escolhaComputador) {
            return Resultado.EMPATE;
        }

        return escolhaUsuario.vence(escolhaComputador)
                ? Resultado.VITORIA
                : Resultado.DERROTA;
    }
}
