package Jogo_RPG;

/**
 * Classe que representa um Guerreiro no jogo de RPG.
 * Especializado em ataques físicos fortes e resistência defensiva.
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor da classe Guerreiro.
     * Inicializa o guerreiro com nome, HP e ataque base padrão.
     *
     * @param nome O nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome, 200, 30);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.printf("%s ataca %s com força física!%n", nome, inimigo.nome);
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        super.defender(danoReduzido);
        System.out.printf("%s reduz o dano recebido para %d.%n", nome, danoReduzido);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Golpe Duplo!%n", nome);
        int danoEspecial = ataqueBase * 2;
        System.out.printf("Dano causado: %d%n", danoEspecial);
    }
}
