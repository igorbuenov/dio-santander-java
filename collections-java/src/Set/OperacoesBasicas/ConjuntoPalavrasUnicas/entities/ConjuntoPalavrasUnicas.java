package Set.OperacoesBasicas.ConjuntoPalavrasUnicas.entities;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            for (String p : palavrasUnicasSet) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavrasUnicasSet.remove(palavra);
                    break;
                }
            }
        }
    }

    public void verificarPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            for (String p : palavrasUnicasSet) {
                System.out.println(p);
                break;
            }
        }
    }

    public void exibirPalavras() {
        for (String p : palavrasUnicasSet) {
            System.out.println(p);
        }
    }




}
