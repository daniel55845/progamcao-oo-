package ed01;

import java.util.Random;

/**
 * Controla a lógica principal do jogo de adivinhação numérica 
 * @author Daniel Tomaz Dal Cortivo
 */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    
    public Jogo(Jogador jogador) {
        Random rand = new Random();

        this.jogador = jogador;

        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {

        jogador.incrementarTentativas();
        
        if (tentativa == numeroSecreto) {

            int pontos = 100 - jogador.getTentativas();

            if (pontos < 0) {
                pontos = 0; 
            }

            jogador.atualizarPontuacao(pontos);
            return "Acertou o numero secreto!";
            
        } else if (tentativa < numeroSecreto) {

            return "O número secreto é maior.";

        } else {

            return "O número secreto é menor.";

        }
    }
}