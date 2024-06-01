package functional_interface.desafios;

/*
    Calcule a média dos números maiores que 5:
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado
 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .filter(num -> num > 5)
                .mapToDouble(Integer::doubleValue)
                .average();

        System.out.println("A soma da media dos numeros maiores que 5 é: " + media.getAsDouble());



    }
}
