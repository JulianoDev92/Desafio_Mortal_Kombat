import mapa.Mapa;
import personagem.Personagem;

public class Partida {

    private Personagem jogador1;
    private Personagem jogador2;
    private Mapa mapa;
    private Personagem vencedor;

    //Construtor, getters e setters


    public Partida(Personagem jogador1, Personagem jogador2, Mapa mapa, Personagem vencedor) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.mapa = mapa;
        this.vencedor = vencedor;
    }

    public Personagem getJogador1() {
        return jogador1;
    }

    public void setJogador1(Personagem jogador1) {
        this.jogador1 = jogador1;
    }

    public Personagem getJogador2() {
        return jogador2;
    }

    public void setJogador2(Personagem jogador2) {
        this.jogador2 = jogador2;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public Personagem getVencedor() {
        return vencedor;
    }

    public void setVencedor(Personagem vencedor) {
        this.vencedor = vencedor;
    }
}
