package sistema_bancario;

/**
 * Classe que representa uma conta bancária genérica.
 * Armazena informações do cliente e saldo, além de fornecer operações bancárias básicas.
 */
public class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da classe Conta.
     * Inicializa o cliente e o saldo da conta.
     *
     * @param cliente O nome do titular da conta.
     * @param saldo O saldo inicial da conta.
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Retorna o nome do titular da conta.
     *
     * @return O nome do titular.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O saldo atual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o nome do titular da conta.
     *
     * @param cliente O nome a ser definido.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Define o saldo da conta.
     *
     * @param saldo O saldo a ser definido.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Realiza um depósito na conta.
     * O valor deve ser positivo para que a operação seja realizada.
     *
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("\nCaro %s,
