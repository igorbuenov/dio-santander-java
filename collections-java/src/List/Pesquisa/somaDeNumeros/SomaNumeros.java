package List.Pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }

    public void  adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public Integer calcularSoma() {

        if (!numerosList.isEmpty()) {
            Integer soma = 0;
            for (Integer num : numerosList) {
                soma += num;
            }
            return soma;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public Integer encontrarMaiorNumero() {
        Integer maior = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer num : numerosList) {
                if (num > maior) {
                    maior = num;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarMenorNumero() {
        Integer menor = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer num : numerosList) {
                if (num < menor) {
                    menor = num;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            for (int i = 0; i < numerosList.size(); i++) {
                System.out.println((i+1) + "° número: " + numerosList.get(i));
            }
        } else {
            System.out.println("A lista está vazia!");
        }

    }
}

