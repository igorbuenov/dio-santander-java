package List.Pesquisa.catalogoDeLivros.application;

import List.Pesquisa.catalogoDeLivros.entities.CatalogoLivros;

public class Program {
    public static void main(String[] args) {


        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2024);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        catalogoLivros.pesquisarPorAutor("Autor 2");
        System.out.println(catalogoLivros.pesquisarPorIntervalosDeAno(1994, 2022));


    }
}
