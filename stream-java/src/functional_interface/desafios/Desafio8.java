package functional_interface.desafios;

/*
    Somar os dígitos de todos os números da lista
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado
 */

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream().mapToInt(n1 -> {
            int sum = 0, length = String.valueOf(n1).length();
            for (int i = 0; i < length; i++) {
                sum += n1 % 10;
                n1 /= 10;
            }
            return sum;
        }).sum();

        System.out.println(somaDigitos);
    }
}
