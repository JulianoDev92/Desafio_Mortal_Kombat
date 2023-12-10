import java.util.Random;

public class Util {
    public static int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        // Uso do golpe
        int golpeAleatorio = gerarNumeroAleatorio(1, 7);
//        System.out.println("Número aleatório gerado: " + golpeAleatorio);

        // Golpes conforme as regras fornecidas
        String golpe = obterGolpePorNumero(golpeAleatorio);
        System.out.println("Golpe : " + golpe);
    }

    public static String obterGolpePorNumero(int numero) {
        switch (numero) {
            case 1:
                return "Soco Alto";
            case 2:
                return "Soco Baixo";
            case 3:
                return "Chute Alto";
            case 4:
                return "Chute Baixo";
            case 5:
                return "Golpe Especial";
            case 6:
                return "Animality";
            case 7:
                return "Fatality";
            default:
                return "Golpe Desconhecido";
        }
    }
}
