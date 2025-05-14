package Jogo_RPG;

/**
 * Classe base que representa um personagem genérico no jogo de RPG.
 * Armazena atributos básicos como nome, pontos de vida (HP) e ataque base.
 * Fornece métodos para atacar, defender e utilizar habilidades especiais.
 */
public abstract class Personagem {

    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem.
     * Inicializa os atributos básicos do personagem.
     *
     * @param nome O nome do personagem.
     * @param hp Os pontos de vida iniciais.
     * @param ataqueBase O valor base do ataque do personagem.
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Realiza um ataque contra outro personagem.
     *
     * @param inimigo O personagem inimigo a ser atacado.
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Calcula e aplica o dano recebido pelo personagem.
     *
     * @param dano O dano a ser recebido.
     */
    public void defender(int dano) {
        this.hp -= Math.max(dano, 0);
    }

    /**
     * Usa a habilidade especial do personagem.
     * Cada subclasse implementa um comportamento único.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.printf("Nome: %s, HP: %d, Ataque Base: %d%n", nome, hp, ataqueBase);
    }
}

