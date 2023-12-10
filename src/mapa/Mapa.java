package mapa;

import personagem.Personagem;

public interface Mapa {

    String getNome();
    int getMaximoVidas();
    int getMaximoGolpesEspeciais();
    boolean verificarStageFatality(Personagem jogador1, Personagem jogador2);
    boolean verificarStageAnimality(Personagem jogador1, Personagem jogador2);

}
