package folha_de_pagamento;

/**
 * classe superclasse abstrata que tem as classes 
 * FuncionarioCLT e FuncionarioTemporario como filhas
 */
abstract class Funcionario{
    String nome;
    double salarioBase;
    double salariototal;

    public Funcionario(String nome,double salarioBase,double salariototal) {
        this.nome = nome;
        this.salarioBase = salarioBase; 
        this.salariototal = salariototal;
        
    }

    public String getNome() {
        return nome;
    }

    public double getSalariototal() {
        return salariototal;
    }

    public void setSalariototal(double salariototal) {
        this.salariototal = salariototal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void exibirDados(){
        System.out.printf("\nnome: %s \n",nome);
        System.out.printf("salario base: %f\n",salarioBase);
        System.out.printf("salario total: %f\n",salariototal);
    }
        
    public abstract double calcularSalario(double salario);


}