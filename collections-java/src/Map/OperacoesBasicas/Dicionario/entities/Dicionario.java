package Map.OperacoesBasicas.Dicionario.entities;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            if (palavrasMap.containsKey(palavra)) {
                palavrasMap.remove(palavra);
            } else {
                throw new RuntimeException("Essa palavra não está no dicionário!");
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {

        String descricaoPorPalavra = null;
        if (!palavrasMap.isEmpty()) {
            if (palavrasMap.containsKey(palavra)) {
                descricaoPorPalavra = palavrasMap.get(palavra);
                return descricaoPorPalavra;
            } else {
                throw new RuntimeException("Palavra não encontrada no dicionário!");
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


}
