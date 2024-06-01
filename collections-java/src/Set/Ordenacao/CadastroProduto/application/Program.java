package Set.Ordenacao.CadastroProduto.application;

import Set.Ordenacao.CadastroProduto.entities.CadastroProduto;

public class Program {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Prodruto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Prodruto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Prodruto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Prodruto 5", 2d, 2);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
