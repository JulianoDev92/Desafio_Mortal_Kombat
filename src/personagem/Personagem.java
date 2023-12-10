package personagem;

public interface Personagem {

    String getNome();
    int getVidaMaxima();
    int getDanoGolpe(String golpe);
    boolean podeExecutarAnimality();
    boolean podeExecutarFatality();

    void receberDano(int danoJogador2);
}
