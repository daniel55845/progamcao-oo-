package ed04.model;


public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    // Não há setter para CNPJ, pois ele deve ser o identificador único e imutável
    // após a criação do objeto.

    @Override
    public String exibirDetalhes() {
        return String.format("%s, CNPJ: %s (Pessoa Jurídica)", super.exibirDetalhes(), cnpj);
    }
}