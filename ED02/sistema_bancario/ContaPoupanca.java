package sistema_bancario;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        double juros = getSaldo() * 0.0008; // 0.08% de juros
        setSaldo(getSaldo() + juros);
        System.out.printf("\nCaro %s, foram adicionados R$%.2f de juros em sua Poupança\n", 
                        getCliente(), juros);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Tipo de Conta: Poupança");
        System.out.println("=======================");
    }
}
