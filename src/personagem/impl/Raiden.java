package personagem.impl;

import personagem.Personagem;

public class Raiden implements Personagem {

    private String nome;
    private int vidaMaxima;
    private int socoAltoDano;
    private int socoBaixoDano;
    private int chuteAltoDano;
    private int chuteBaixoDano;
    private int golpeEspecialDano;
    private boolean podeExecutarAnimality;
    private boolean podeExecutarFatality;

    public Raiden() {
        this.nome = "Raiden";
        this.vidaMaxima = 110;
        this.socoAltoDano = 6;
        this.socoBaixoDano = 4;
        this.chuteAltoDano = 7;
        this.chuteBaixoDano = 5;
        this.golpeEspecialDano = 12;
        this.podeExecutarAnimality = true;
        this.podeExecutarFatality = true;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    @Override
    public int getDanoGolpe(String golpe) {
        switch (golpe) {
            case "SocoAlto":
                return socoAltoDano;
            case "SocoBaixo":
                return socoBaixoDano;
            case "ChuteAlto":
                return chuteAltoDano;
            case "ChuteBaixo":
                return chuteBaixoDano;
            case "GolpeEspecial":
                return golpeEspecialDano;
            default:
                return 0; // Golpe desconhecido
        }
    }

    @Override
    public boolean podeExecutarAnimality() {
        return false;
    }

    @Override
    public boolean podeExecutarFatality() {
        return false;
    }

    @Override
    public void receberDano(int danoJogador2) {
        // Lógica para receber dano
        vidaMaxima -= danoJogador2;
        if (vidaMaxima < 0) {
            vidaMaxima = 0;
        }
    }
}

//Soco alto: 6 de dano
//Soco baixo: 4 de dano
//Chute alto: 7 de dano
//Chute baixo: 5 de dano
//Golpe Especial: 12 de dano (Teleport)
// Vida máxima: 110
// Animality: Sim
//Fatality: Sim
