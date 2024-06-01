package Map.Pesquisa.EstoqueProduto.application;

import Map.Pesquisa.EstoqueProduto.entities.EstoqueProdutos;

public class Program {
    public static void main(String[] args) {


        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoque.adicionarProduto(4L, "Produto D", 20.0, 2);

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor de estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());


    }
}
