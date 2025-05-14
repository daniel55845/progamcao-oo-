package sistema_bancario;

/**
 * Classe que representa uma conta poupança.
 * Herda da classe Conta e aplica juros diários específicos.
 */
public class ContaPoupanca extends Conta {
    /**
     * Construtor da classe ContaPoupanca.
     * Inicializa o cliente e o saldo da conta poupança.
     *
     * @param cliente O nome do titular da conta.
     * @param saldo O saldo inicial da conta.
     */
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica juros diários na conta poupança.
     * A taxa aplicada é de 0.08% sobre o saldo atual.
     */
    @Override
    public void aplicarJurosDiarios() {
        double juros = getSaldo() * 0.0008; // 0.08% de juros
        setSaldo(getSaldo() + juros);
        System.out.printf("\nCaro %s, foram adicionados R$%.2f de juros em sua Poupança\n", 
                        getCliente(), juros);
    }

    /**
     * Imprime o extrato da conta poupança.
     * Inclui informações específicas do tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Poupança");
        System.out.println("=======================");
    }
}
