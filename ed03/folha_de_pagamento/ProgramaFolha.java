package folha_de_pagamento;
/**
 * classe que contem omtodo princpal que intancia objetos da classe e chama os metodos
 */
public class ProgramaFolha   {
    public static void main(String[] args) {
    FuncionarioCLT ana = new FuncionarioCLT("ana",2000);
    FuncionarioTemporario carlos = new FuncionarioTemporario("carlos",2000);

    carlos.calcularSalario(2000);
    ana.calcularSalario(2000);

    ana.exibirDados();
    carlos.exibirDados();
}
    
    
}
