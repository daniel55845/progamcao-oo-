package sistema_bancario;

/**
 * Classe que representa uma conta salário.
 * Herda da classe Conta e não aplica juros diários.
 */
public class ContaSalario extends Conta {
    /**
     * Construtor da classe ContaSalario.
     * Inicializa o cliente e o saldo da conta salário.
     *
     * @param cliente O nome do titular da conta.
     * @param saldo O saldo inicial da conta.
     */
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Método específico para conta salário.
     * Contas salário não rendem juros diários.
     */
    @Override
    public void aplicarJurosDiarios() {
        System.out.printf("\nCaro %s, conta salário não rende juros\n", getCliente());
    }

    /**
     * Imprime o extrato da conta salário.
     * Inclui informações específicas do tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Salário");
        System.out.println("======================");
    }
}
