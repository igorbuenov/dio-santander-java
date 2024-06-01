package functional_interface.desafios;

/*
    Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, econtre o segundo número maior da lista e exiba o resultado no console;
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer resultado = numeros.stream().sorted().collect(Collectors.toList()).get(numeros.size() - 2);
        System.out.println("O segundo maior número na lista é: " + resultado);

    }
}
