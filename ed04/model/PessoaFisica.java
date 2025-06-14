package ed04.model;


public class PessoaFisica extends ContatoBase {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // Não há setter para CPF, pois ele deve ser o identificador único e imutável
    // após a criação do objeto.

    @Override
    public String exibirDetalhes() {
        return String.format("%s, CPF: %s (Pessoa Física)", super.exibirDetalhes(), cpf);
    }
}