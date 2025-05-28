package grafica_online;

/**
 * Representa um documento de texto que pode ser impresso.
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor da classe DocumentoTexto.
     * @param titulo Título do documento
     * @param conteudo Conteúdo do documento
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo + "\n");
    }
}
