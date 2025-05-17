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
            System.out.printf("\nCaro %s, seu depósito de R$%.2f foi realizado com sucesso!\n", cliente, valor);
        } else {
            System.out.printf("\nCaro %s, valor de depósito inválido!\n", cliente);
        }
    }

    /**
     * Realiza um saque na conta.
     * O valor deve ser positivo e menor ou igual ao saldo disponível.
     *
     * @param valor O valor a ser sacado.
     */
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("\nCaro %s, saque de R$%.2f realizado com sucesso!\n", cliente, valor);
        } else {
            System.out.printf("\nCaro %s, saldo insuficiente ou valor inválido para saque!\n", cliente);
        }
    }

    /**
     * Realiza uma transferência para outra conta.
     * O valor deve ser positivo e menor ou igual ao saldo disponível.
     *
     * @param destino A conta de destino da transferência.
     * @param valor O valor a ser transferido.
     */
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.printf("\nCaro %s, transferência de R$%.2f para %s realizada com sucesso!\n", 
                             cliente, valor, destino.getCliente());
        } else {
            System.out.printf("\nCaro %s, transferência não realizada. Saldo insuficiente ou valor inválido!\n", cliente);
        }
    }

    /**
     * Imprime o extrato da conta, mostrando o titular e o saldo atual.
     */
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Bancário ===");
        System.out.printf("Cliente: %s\nSaldo: R$%.2f\n", cliente, saldo);
    }

    /**
     * Aplica juros diários na conta.
     * Implementação padrão sem aplicação de juros.
     */
    public void aplicarJurosDiarios() {
        // Implementação padrão (sem juros)
    }
}
