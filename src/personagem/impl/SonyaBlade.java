package personagem.impl;

import personagem.Personagem;

public class SonyaBlade implements Personagem {

    private String nome;
    private int vidaMaxima;
    private int socoAltoDano;
    private int socoBaixoDano;
    private int chuteAltoDano;
    private int chuteBaixoDano;
    private int golpeEspecialDano;
    private boolean podeExecutarAnimality;
    private boolean podeExecutarFatality;

    public SonyaBlade() {
        // Inicialize os valores aqui
        this.nome = "SonyaBlade";
        this.vidaMaxima = 100;
        this.socoAltoDano = 5;
        this.socoBaixoDano = 3;
        this.chuteAltoDano = 6;
        this.chuteBaixoDano = 4;
        this.golpeEspecialDano = 10;
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

//Soco alto: 5 de dano
//Soco baixo: 3 de dano
//Chute alto: 6 de dano
//Chute baixo: 4 de dano
//Golpe Especial: 10 de dano (Ring Toss)
// Vida máxima: 100
// Animality: Não
//Fatality: Sim