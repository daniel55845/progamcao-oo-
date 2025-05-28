package grafica_online;

/**
 * Representa um relatório em PDF que pode ser impresso.
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor da classe RelatorioPDF.
     * @param autor Autor do relatório
     * @param numeroPaginas Número total de páginas
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas + "\n");
    }
}