package personagem.impl;

import personagem.Personagem;

public class Goro implements Personagem {

    private String nome;
    private int vidaMaxima;
    private int socoAltoDano;
    private int socoBaixoDano;
    private int chuteAltoDano;
    private int chuteBaixoDano;
    private int golpeEspecialDano;
    private boolean podeExecutarAnimality;
    private boolean podeExecutarFatality;

    public Goro() {
        this.nome = "Goro";
        this.vidaMaxima = 120;
        this.socoAltoDano = 7;
        this.socoBaixoDano = 5;
        this.chuteAltoDano = 8;
        this.chuteBaixoDano = 6;
        this.golpeEspecialDano = 15;
        this.podeExecutarAnimality = false;
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

//Soco alto: 7 de dano
//Soco baixo: 5 de dano
//Chute alto: 8 de dano
//Chute baixo: 6 de dano
//Golpe Especial: 15 de dano (Ground Pound)
// Vida máxima: 120
// Animality: Não
//Fatality: Sim
