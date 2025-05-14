package Jogo_RPG;

/**
 * Classe que representa um Mago no jogo de RPG.
 * Especializado em ataques mágicos poderosos, mas com baixa defesa.
 */
public class Mago extends Personagem {

    /**
     * Construtor da classe Mago.
     * Inicializa o mago com nome, HP e ataque base padrão.
     *
     * @param nome O nome do mago.
     */
    public Mago(String nome) {
        super(nome, 120, 40);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.printf("%s lança um feitiço contra %s!%n", nome, inimigo.nome);
        inimigo.defender(ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Bola de Fogo, causando dano em área!%n", nome);
    }
}

