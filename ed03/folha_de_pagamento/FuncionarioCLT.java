package folha_de_pagamento;
/**
 * Representa um funcionário CLT 
 * Seu salário total é calculado como salário base + R$ 300.
 */

public class FuncionarioCLT extends Funcionario {


    public FuncionarioCLT(String nome,double salarioBase){
        super(nome,salarioBase,0);
    }

    @Override
    public double calcularSalario(double salario){
        salario = getSalarioBase() + 300;
        setSalariototal(salario);
        return salario;

    }
}
