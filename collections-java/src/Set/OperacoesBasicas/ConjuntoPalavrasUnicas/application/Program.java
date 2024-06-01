package Set.OperacoesBasicas.ConjuntoPalavrasUnicas.application;

import Set.OperacoesBasicas.ConjuntoPalavrasUnicas.entities.ConjuntoPalavrasUnicas;

public class Program {
    public static void main(String[] args) {


        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teste 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste 3");

        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Teste 1");
        conjuntoPalavrasUnicas.exibirPalavras();


    }
}
