package ed04.view;

import java.util.List;
import java.util.Scanner;

import ed04.model.Contato;
import ed04.model.PessoaFisica;

public class ContatoView {
    private Scanner scanner;

    public ContatoView() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\n--- Agenda de Contatos ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Excluir Contato");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida. Por favor, digite um número.");
            scanner.next(); // Consome a entrada inválida
        }
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        return opcao;
    }

    public String lerTipoContato() {
        String tipo;
        do {
            System.out.print("Tipo de Contato (PF/PJ): ");
            tipo = scanner.nextLine().toUpperCase();
            if (!tipo.equals("PF") && !tipo.equals("PJ")) {
                System.out.println("Tipo de contato inválido. Digite 'PF' para Pessoa Física ou 'PJ' para Pessoa Jurídica.");
            }
        } while (!tipo.equals("PF") && !tipo.equals("PJ"));
        return tipo;
    }

    public String lerNome() {
        String nome;
        do {
            System.out.print("Nome (mínimo 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Deve ter no mínimo 3 caracteres.");
            }
        } while (nome.length() < 3);
        return nome;
    }

    public String lerTelefone() {
        System.out.print("Telefone: ");
        return scanner.nextLine();
    }

    public String lerEmail() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }

    public String lerCpf() {
        String cpf;
        do {
            System.out.print("CPF (11 dígitos numéricos): ");
            cpf = scanner.nextLine();
            if (!cpf.matches("\\d{11}")) {
                System.out.println("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
            }
        } while (!cpf.matches("\\d{11}"));
        return cpf;
    }

    public String lerCnpj() {
        String cnpj;
        do {
            System.out.print("CNPJ (14 dígitos numéricos): ");
            cnpj = scanner.nextLine();
            if (!cnpj.matches("\\d{14}")) {
                System.out.println("CNPJ inválido. Deve conter exatamente 14 dígitos numéricos.");
            }
        } while (!cnpj.matches("\\d{14}"));
        return cnpj;
    }

    public String lerIdentificadorParaBusca() {
        System.out.print("Digite o CPF ou CNPJ do contato: ");
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Contatos ---");
        System.out.printf("%-5s %-25s %-15s %-25s %-20s %s\n", "ID", "Nome", "Telefone", "Email", "Identificador", "Tipo");
        System.out.println("--------------------------------------------------------------------------------------------------");
        int id = 1;
        for (Contato contato : contatos) {
            String tipo = (contato instanceof PessoaFisica) ? "PF" : "PJ";
            System.out.printf("%-5d %-25s %-15s %-25s %-20s %s\n",
                    id++,
                    contato.getNome(),
                    contato.getTelefone(),
                    contato.getEmail(),
                    contato.getIdentificador(),
                    tipo);
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}