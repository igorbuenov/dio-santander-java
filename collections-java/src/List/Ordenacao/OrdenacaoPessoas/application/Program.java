package List.Ordenacao.OrdenacaoPessoas.application;

import List.Ordenacao.OrdenacaoPessoas.entities.OrdenacaoPessoas;

public class Program {
    public static void main(String[] args) {


        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println();
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
