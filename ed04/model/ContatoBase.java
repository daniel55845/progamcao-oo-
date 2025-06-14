package ed04.model;

public abstract class ContatoBase implements Contato {
    protected String nome;
    protected String telefone;
    protected String email;

    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstrato para obter o identificador específico (CPF/CNPJ)
    public abstract String getIdentificador();

    @Override
    public String exibirDetalhes() {
        return String.format("Nome: %s, Telefone: %s, Email: %s", nome, telefone, email);
    }
}