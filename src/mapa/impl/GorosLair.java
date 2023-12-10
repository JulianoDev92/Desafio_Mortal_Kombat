package mapa.impl;

import mapa.Mapa;
import personagem.Personagem;

public class GorosLair implements Mapa {
    @Override
    public String getNome() {
        return "Goro's Lair";
    }

    @Override
    public int getMaximoVidas() {
        return 1;
    }

    @Override
    public int getMaximoGolpesEspeciais() {
        return 2;
    }

    @Override
    public boolean verificarStageFatality(Personagem jogador1, Personagem jogador2) {
        return false;
    }

    @Override
    public boolean verificarStageAnimality(Personagem jogador1, Personagem jogador2) {
        if (jogador1.podeExecutarAnimality() && jogador2.getVidaMaxima() <= 0.15 * jogador2.getVidaMaxima()) {
            // Implementação da lógica específica para o Stage Fatality aqui
            System.out.println(jogador1.getNome() + " executou o Stage Animality em " + jogador2.getNome());
            return true; // Stage Animality executado com sucesso
        }
        if (jogador2.podeExecutarAnimality() && jogador1.getVidaMaxima() <= 0.15 * jogador1.getVidaMaxima()) {
            System.out.println(jogador2.getNome() + " executou o Stage Animality em " + jogador1.getNome());
            return true; // Stage Animality executado com sucesso
        } else {
            return false; // Não foi possível executar o Stage Fatality
        }
    }
}

// Máximo de vidas: 1
// Máximo de golpes especiais: 2
// Animality: Sim
// Fatality: Não
