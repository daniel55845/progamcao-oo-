package Jogo_RPG;

/**
 * Classe que representa um Arqueiro no jogo de RPG.
 * Especializado em ataques precisos com chance de acerto crítico.
 */
public class Arqueiro extends Personagem {

    /**
     * Construtor da classe Arqueiro.
     * Inicializa o arqueiro com nome, HP e ataque base padrão.
     *
     * @param nome O nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.printf("%s dispara uma flecha contra %s!%n", nome, inimigo.nome);
        int dano = ataqueBase;
        if (Math.random() < 0.25) { // 25% de chance de crítico
            dano *= 2;
            System.out.printf("Acerto crítico! Dano dobrado: %d%n", dano);
        }
        inimigo.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Chuva de Flechas, atacando três vezes!%n", nome);
    }
}
