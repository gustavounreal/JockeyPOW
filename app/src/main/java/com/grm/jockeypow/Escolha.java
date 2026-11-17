package com.grm.jockeypow;

public enum Escolha {
    PEDRA,
    PAPEL,
    TESOURA;

    public boolean vence(Escolha outraEscolha) {
        return (this == PEDRA && outraEscolha == TESOURA)
                || (this == PAPEL && outraEscolha == PEDRA)
                || (this == TESOURA && outraEscolha == PAPEL);
    }
}
