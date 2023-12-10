package mapa.impl;

import mapa.Mapa;
import personagem.Personagem;

public class ThePit implements Mapa {

    @Override
    public String getNome() {
        return "The Pit";
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
        if (jogador1.podeExecutarFatality() && jogador2.getVidaMaxima() <= 0.15 * jogador2.getVidaMaxima()) {
            // Implementação da lógica específica para o Stage Fatality aqui
            System.out.println(jogador1.getNome() + " executou o Stage Fatality em " + jogador2.getNome());
            return true; // Stage Fatality executado com sucesso
        }
        if (jogador2.podeExecutarFatality() && jogador1.getVidaMaxima() <= 0.15 * jogador1.getVidaMaxima()) {
            System.out.println(jogador2.getNome() + " executou o Stage Fatality em " + jogador1.getNome());
            return true; // Stage Fatality executado com sucesso
        } else {
            return false; // Não foi possível executar o Stage Fatality
        }
    }

    @Override
    public boolean verificarStageAnimality(Personagem jogador1, Personagem jogador2) {
        return false;
    }
}

// Máximo de vidas: 2
// Máximo de golpes especiais: 1
// Animality: Não
// Fatality: Sim