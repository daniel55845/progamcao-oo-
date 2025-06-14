package ed04.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ed04.model.Contato;
import ed04.model.PessoaFisica;
import ed04.model.PessoaJuridica;
import ed04.view.ContatoView;

public class ContatoController {
    private List<Contato> contatos;
    private ContatoView view;

    public ContatoController(ContatoView view) {
        this.contatos = new ArrayList<>();
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            view.exibirMenu();
            opcao = view.lerOpcao();

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    atualizarContato();
                    break;
                case 4:
                    excluirContato();
                    break;
                case 0:
                    view.exibirMensagem("Saindo da Agenda de Contatos. Até mais!");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarContato() {
        String tipo = view.lerTipoContato();
        String nome = view.lerNome();
        String telefone = view.lerTelefone();
        String email = view.lerEmail();

        Contato novoContato = null;

        if (tipo.equals("PF")) {
            String cpf = view.lerCpf();
            if (buscarContatoPorIdentificador(cpf) != null) {
                view.exibirMensagem("Erro: Já existe um contato com este CPF.");
                return;
            }
            novoContato = new PessoaFisica(nome, telefone, email, cpf);
        } else if (tipo.equals("PJ")) {
            String cnpj = view.lerCnpj();
            if (buscarContatoPorIdentificador(cnpj) != null) {
                view.exibirMensagem("Erro: Já existe um contato com este CNPJ.");
                return;
            }
            novoContato = new PessoaJuridica(nome, telefone, email, cnpj);
        }

        if (novoContato != null) {
            contatos.add(novoContato);
            view.exibirMensagem("Contato adicionado com sucesso!");
        }
    }

    private void listarContatos() {
        view.exibirContatos(contatos);
    }

    private void atualizarContato() {
        if (contatos.isEmpty()) {
            view.exibirMensagem("Nenhum contato para atualizar.");
            return;
        }

        String identificador = view.lerIdentificadorParaBusca();
        Contato contatoParaAtualizar = buscarContatoPorIdentificador(identificador);

        if (contatoParaAtualizar != null) {
            view.exibirMensagem("Contato encontrado. Digite as novas informações (deixe em branco para manter o atual):");

            String novoNome = view.lerNome();
            if (!novoNome.isEmpty()) {
                contatoParaAtualizar.setNome(novoNome);
            }

            String novoTelefone = view.lerTelefone();
            if (!novoTelefone.isEmpty()) {
                contatoParaAtualizar.setTelefone(novoTelefone);
            }

            String novoEmail = view.lerEmail();
            if (!novoEmail.isEmpty()) {
                contatoParaAtualizar.setEmail(novoEmail);
            }
            view.exibirMensagem("Contato atualizado com sucesso!");
        } else {
            view.exibirMensagem("Contato não encontrado com o identificador fornecido.");
        }
    }

    private void excluirContato() {
        if (contatos.isEmpty()) {
            view.exibirMensagem("Nenhum contato para excluir.");
            return;
        }

        String identificador = view.lerIdentificadorParaBusca();
        boolean removido = false;
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getIdentificador().equals(identificador)) {
                iterator.remove();
                removido = true;
                break;
            }
        }

        if (removido) {
            view.exibirMensagem("Contato excluído com sucesso!");
        } else {
            view.exibirMensagem("Contato não encontrado com o identificador fornecido.");
        }
    }

    private Contato buscarContatoPorIdentificador(String identificador) {
        for (Contato contato : contatos) {
            if (contato.getIdentificador().equals(identificador)) {
                return contato;
            }
        }
        return null;
    }
}