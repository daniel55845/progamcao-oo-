package grafica_online;
/**
 * Classe principal que demonstra o uso das classes de impressão.
 */
public class ProgramaImpressao {
    public static void main(String[] args) {
        // Criando instâncias de cada tipo de Imprimivel
        DocumentoTexto doc = new DocumentoTexto(
            "Documento de Apresentação", 
            "Este é o conteúdo do documento."
        );
        
        ImagemDigital img = new ImagemDigital(
            "paisagem.jpg", 
            "1920x1080"
        );
        
        GraficoEstatistico grafico = new GraficoEstatistico(
            "Distribuição de Vendas", 
            "barra"
        );
        
        RelatorioPDF relatorio = new RelatorioPDF(
            "João Silva", 
            12
        );

        // Chamando o método imprimir() em cada instância
        doc.imprimir();
        img.imprimir();
        grafico.imprimir();
        relatorio.imprimir();
    }
}
