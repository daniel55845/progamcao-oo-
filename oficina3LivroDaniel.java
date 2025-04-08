public class oficina3LivroDaniel {

    public String titulodolivro;
    public String autor;
    public short paginastotal;
    public short paginasatual = 0;
    public boolean abertodeschrodinger = false;

    public void abrir(){
        if(abertodeschrodinger == false)
        {
            abertodeschrodinger = true;
            System.out.printf("\n voce abriu O Livro %s do autor %s!\n",titulodolivro,autor,"\n");           
        }else{
            System.out.printf("\n O Livro %s ja esta aberto ! \n",titulodolivro,"\n");
        }
    }
    public void fechar(){
        if(abertodeschrodinger == true)
        {
            abertodeschrodinger = false;
            System.out.printf("\n voce virou para a proxima pagina anterior do livro %s do autor %s",titulodolivro,autor,"\n");              
        }else{
            System.out.printf("\n O Livro %s ja esta FECHADO ! ",titulodolivro,"\n");
        }
    }
    public void virar_pagina(){
        if ((paginastotal > paginasatual) && (abertodeschrodinger = true)){
            paginasatual++;
            System.out.printf("\n voce virou para a proxima pagina anterior do livro %s do autor %s " ,titulodolivro,autor,"\n");
        }else{
            System.out.printf("livro fechado e/ou voce ja completou o livro");
        }
    }
    public void voltar_pagina(){
        if ((paginasatual != 0) && (abertodeschrodinger = true) ){
            paginasatual--;
            System.out.printf("\nvoce voltou para a pagina anterior do livro %s do autor %s",titulodolivro,autor,"\n");
        }else
        {
            System.out.println("livro fechado e/ou voce esta 0 paginas ");
        }
        
    }
    public void ir_pagina(int pagina){
        if ((abertodeschrodinger = true) && ( pagina >= 1)){
            pagina = paginasatual;
            System.out.printf("\nvoce foi para a pagina %s do livro %s do autor %s ",pagina,titulodolivro,autor,"\n");
        }else {
            System.out.println("livro fechado e/ou pagina nao existe");
        }

    }

    public static void main(String[] args) {

        oficina3LivroDaniel livro1Daniel = new oficina3LivroDaniel();

        livro1Daniel.titulodolivro = "O Senhor dos Anéis";
        livro1Daniel.autor = "J.R.R. Tolkien";
        livro1Daniel.paginastotal = 1000;

        livro1Daniel.abrir();
        livro1Daniel.virar_pagina();
        livro1Daniel.ir_pagina(500);
        livro1Daniel.voltar_pagina();
        livro1Daniel.fechar();

        

    }
}