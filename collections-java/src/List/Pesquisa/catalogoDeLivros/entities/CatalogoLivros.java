package List.Pesquisa.catalogoDeLivros.entities;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int ano) {
        livrosList.add(new Livro(nome, autor, ano));
    }

    public void pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        for (int i = 0; i < livrosPorAutor.size(); i++) {
            System.out.println((i+1) + " livro encontrado: " + livrosPorAutor.get(i));
        }

    }

    public List<Livro> pesquisarPorIntervalosDeAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAno.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;
        try {
            if (!livrosList.isEmpty()) {
                for (Livro livro : livrosList) {
                    if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                        livroPorTitulo = livro;
                        break;
                    }
                }
            }

            if (livroPorTitulo == null) {
                throw new Exception("Livro não encontrado!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return livroPorTitulo;


    }


}
