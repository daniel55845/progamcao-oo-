package folha_de_pagamento;
/**
 * Representa um funcionário temporário.
 * Seu salário total é calculado como salário base - R$ 100 (desconto temporário).
 */
public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome,double salarioBase){
        super(nome,salarioBase,0);
    }
    

    @Override
    public double calcularSalario(double salario){
        salario = getSalarioBase() - 100;
        setSalariototal(salario);
        return salario;

    }
}
    

