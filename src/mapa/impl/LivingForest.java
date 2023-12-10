package mapa.impl;

import mapa.Mapa;
import personagem.Personagem;

public class LivingForest implements Mapa {
    @Override
    public String getNome() {
        return "Living Forest";
    }

    @Override
    public int getMaximoVidas() {
        return 2;
    }

    @Override
    public int getMaximoGolpesEspeciais() {
        return 1;
    }

    @Override
    public boolean verificarStageFatality(Personagem jogador1, Personagem jogador2) {
        return false;
    }

    @Override
    public boolean verificarStageAnimality(Personagem jogador1, Personagem jogador2) {
        return false;
    }
}

// Máximo de vidas: 2
// Máximo de golpes especiais: 1
// Animality: Não
// Fatality: Não
