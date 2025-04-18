package ed01;

/**
 * Classe principal que controla o jogo de adivinhação de números.
 * 
 * @author Daniel Tomaz Dal Cortivo
 * @see Jogador
 * @see Jogo
 * @see Placar
 */
import java.util.Scanner;

/**
 * Método principal do jogo Responsável por coletar o nome do jogador via {@link Scanner}, iniciar o loop principal
 * do jogo e gerenciar as interações entre as classes {@link Jogador}, {@link Jogo} e {@link Placar}.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanfj = new Scanner(System.in);

        Placar placar = new Placar();

        System.out.println("============ O Jogo da Adivinhação! ===============");

        System.out.print("Digite o seu nome: ");
        String nomeJogador = scanfj.nextLine();

        Jogador jogador = new Jogador(nomeJogador);
        Jogo jogo = new Jogo(jogador);

        System.out.println("Tente adivinhar o número secreto (entre 1 e 100)!");
        boolean acertou = false;

        while (!acertou) {

            System.out.print("Sua tentativa: ");

            int tentativa = scanfj.nextInt();
            
            String resultado = jogo.jogar(tentativa);
            
            System.out.print("\033[H\033[2J"); // limpa a tela do console em cada tentativa 
            
            System.out.println(resultado);

            if (resultado == "Acertou o numero secreto!") {

                
                System.out.println("voce ganhou O Jogo da Adivinhação !!");
                
                acertou = true;

            }
        }

        System.out.printf("\n===============================================================\n");
        System.out.printf("Você acertou em %d tentativas e sua pontuação final foi %d de 100.%n",jogador.getTentativas(), jogador.getPontuacao());
        System.out.printf("=================================================================\n");

        placar.adicionarJogador(jogador);
        placar.mostra_Ranking();

        scanfj.close();
    }
}