package sistema_bancario;

public class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("\nCaro %s, seu depósito de R$%.2f foi realizado com sucesso!\n", cliente, valor);
        } else {
            System.out.printf("\nCaro %s, valor de depósito inválido!\n", cliente);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("\nCaro %s, saque de R$%.2f realizado com sucesso!\n", cliente, valor);
        } else {
            System.out.printf("\nCaro %s, saldo insuficiente ou valor inválido para saque!\n", cliente);
        }
    }

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

    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Bancário ===");
        System.out.printf("Cliente: %s\nSaldo: R$%.2f\n", cliente, saldo);
    }

    public void aplicarJurosDiarios() {
        // Implementação padrão (sem juros)
    }
}
