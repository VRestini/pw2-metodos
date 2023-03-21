public class Livro {

    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;

    void exibirDados(){
        System.out.println("Nome:"+ nome);
        System.out.println("Preço:"+ preco);
        System.out.println("Paginas:"+ paginas);
        System.out.println("Resumo:"+ resumo);
        System.out.println("Autor:"+ autor);
        System.out.println("-----------------");
    }
    void aplicarDesconto(double percentual){
        preco = preco - preco * percentual;
    }
    void acrescentarTaxa(){
        preco = preco + preco *0.08;
    }
}
