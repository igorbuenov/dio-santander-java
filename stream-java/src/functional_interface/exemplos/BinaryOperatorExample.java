package functional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar BinaryOperator para somar os números
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        int resultado1 = numeros.stream()
                .reduce(0, somar);

        // Usar method reference para somar os números
        int resultado2 = numeros.stream().reduce(0, Integer::sum);

        // Usar Lambda para somar os números
        int resultado3 = numeros.stream().reduce(0, (num1, num2) -> num1 + num2);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado1);
        System.out.println("A soma dos números é: " + resultado2);
        System.out.println("A soma dos números é: " + resultado3);

    }
}
