package sistema_bancario;

/**
 * Classe que representa uma conta corrente.
 * Herda da classe Conta e aplica juros diários específicos.
 */
public class ContaCorrente extends Conta {
    /**
     * Construtor da classe ContaCorrente.
     * Inicializa o cliente e o saldo da conta corrente.
     *
     * @param cliente O nome do titular da conta.
     * @param saldo O saldo inicial da conta.
     */
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica juros diários na conta corrente.
     * A taxa aplicada é de 0.1% sobre o saldo atual.
     */
    @Override
    public void aplicarJurosDiarios() {
        double juros = getSaldo() * 0.001; // 0.1% de juros
        setSaldo(getSaldo() + juros);
        System.out.printf("\nCaro %s, foram adicionados R$%.2f de juros em sua Conta Corrente\n", 
                        getCliente(), juros);
    }

    /**
     * Imprime o extrato da conta corrente.
     * Inclui informações específicas do tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("=======================");
    }
}
