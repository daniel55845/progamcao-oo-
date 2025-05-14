package sistema_bancario;

public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        System.out.printf("\nCaro %s, conta salário não rende juros\n", getCliente());
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Salário");
        System.out.println("======================");
    }
}
