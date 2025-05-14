package sistema_bancario;

public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        double juros = getSaldo() * 0.001; // 0.1% de juros
        setSaldo(getSaldo() + juros);
        System.out.printf("\nCaro %s, foram adicionados R$%.2f de juros em sua Conta Corrente\n", 
                        getCliente(), juros);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("=======================");
    }
}
