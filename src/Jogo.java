import mapa.Mapa;
import mapa.impl.GorosLair;
import personagem.Personagem;
import personagem.impl.*;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Jogo {

    public Personagem executarPartida(Personagem jogador1, Personagem jogador2, Mapa mapa) {
        System.out.println("Iniciando partida entre " + jogador1.getNome() + " e " + jogador2.getNome() +
                " no mapa " + mapa.getNome());

        // Lógica da partida básica (exemplo: o jogador com mais vida vence)
        int vidaJogador1 = jogador1.getVidaMaxima();
        int vidaJogador2 = jogador2.getVidaMaxima();

        while (vidaJogador1 > 0 && vidaJogador2 > 0) {
            // Simplesmente reduza a vida de ambos os jogadores aleatoriamente para este exemplo
            int dano1 = (int) (Math.random() * 10) + 1;
            int dano2 = (int) (Math.random() * 10) + 1;

            jogador1.receberDano(dano2);
            jogador2.receberDano(dano1);

            vidaJogador1 = jogador1.getVidaMaxima();
            vidaJogador2 = jogador2.getVidaMaxima();
        }

        // Retorne o vencedor da partida
        Personagem vencedor = (vidaJogador1 > 0) ? jogador1 : jogador2;
        System.out.println("Vencedor da partida: " + vencedor.getNome());

        // Execute a lógica de fatality ou animality se possível
        if (mapa.verificarStageFatality(jogador1, jogador2)) {
            System.out.println("Fatality realizado no mapa " + mapa.getNome());
        } else if (mapa.verificarStageAnimality(jogador1, jogador2)) {
            System.out.println("Animality realizado no mapa " + mapa.getNome());
        }

        return vencedor;
    }

    public Personagem executarTorneio(Personagem jogadorPrincipal, List<Mapa> mapas, List<Personagem> jogadores) {
        System.out.println("Iniciando torneio com " + jogadores.size() + " jogadores");

        // Iterar sobre os mapas
        for (Mapa mapa : mapas) {
            System.out.println("Iniciando fase do torneio no mapa " + mapa.getNome());

            // Iterar sobre os jogadores
            for (Personagem jogador : jogadores) {
                // Ignorar o jogador principal (se existir) para evitar partidas consigo mesmo
                if (jogador != null && !jogador.equals(jogadorPrincipal)) {
                    executarPartida(jogadorPrincipal, jogador, mapa);
                }
            }

            // Lógica adicional do torneio, se necessário
            // ...
        }

        System.out.println("Torneio concluído.");

        // Retorne o vencedor geral do torneio
        // (pode ser necessário uma lógica adicional para determinar o vencedor do torneio)
        return jogadores.get(0);
    }
    public static void main(String[] args) {
        // Exemplo de utilização

        // Criar instâncias de jogadores, mapas, etc.
        Personagem jogador1 = new JohnnyCage();
        Personagem jogador2 = new Goro();

        Mapa mapa1 = new GorosLair();

        List<Mapa> mapas = new ArrayList<>();
        mapas.add(mapa1);

        List<Personagem> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);

        // instância do Jogo
        Jogo jogo = new Jogo();

        // Executar uma partida
        Personagem vencedorPartida = jogo.executarPartida(jogador1, jogador2, mapa1);
        System.out.println("Vencedor da partida: " + vencedorPartida.getNome());

        // Executar o torneio
        Personagem vencedorTorneio = jogo.executarTorneio(jogador1, mapas, jogadores);
        System.out.println("Vencedor do torneio: " + vencedorTorneio.getNome());
    }
}


