package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;

/*
    Verifique se todos os números da lista são positivos
    Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

 */
public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream().allMatch(num -> num >= 0);

        System.out.println("Todos os números são positivos? " + resultado);


    }
}
