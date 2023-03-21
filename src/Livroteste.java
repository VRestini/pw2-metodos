public class Livroteste {
    public static void main(String[] args) {
       Livro meuLivro = new Livro();
       meuLivro.nome = "A bíblia da sedução";
       meuLivro.preco = 20.99;
       meuLivro.paginas = 300;
       meuLivro.resumo = "Técnicas de sedução";
       meuLivro.autor = "Neil Strauss";

       meuLivro.aplicarDesconto(0.2);
       meuLivro.acrescentarTaxa();
       meuLivro.exibirDados();


       Livro livroFavorito = new Livro();
       livroFavorito.nome = "A arte da Guerra";
       livroFavorito.paginas = 158;
       livroFavorito.preco = 39.90;
       livroFavorito.resumo = "Guerra";
       livroFavorito.autor="Sun Tzu";
       meuLivro.aplicarDesconto(0.1);
       livroFavorito.exibirDados();
    }
}
