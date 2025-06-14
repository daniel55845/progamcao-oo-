
package ed04.model;

public interface Contato {
    String getIdentificador(); // Pode ser CPF ou CNPJ
    String getNome();
    String getTelefone();
    String getEmail();
    void setNome(String nome);
    void setTelefone(String telefone);
    void setEmail(String email);
    String exibirDetalhes();
}