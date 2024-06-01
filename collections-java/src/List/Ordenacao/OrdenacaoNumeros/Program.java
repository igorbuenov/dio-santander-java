package List.Ordenacao.OrdenacaoNumeros;

public class Program {
    public static void main(String[] args) {

        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        System.out.println("Exibir números: ");
        numeros.exibirNumeros();
        System.out.println();

        // Ordenando e exibindo em ordem ascendente
        System.out.println("Ordenar ascendente: ");
        System.out.println(numeros.ordenarAscendente());
        System.out.println();

        // Exibindo a lista
        System.out.println("Exibir números: ");
        numeros.exibirNumeros();
        System.out.println();

        // Ordenando e exibindo em ordem descendente
        System.out.println("Ordenar descendente: ");
        System.out.println(numeros.ordenarDescendente());
        System.out.println();

        // Exibindo a lista
        System.out.println("Exibir numeros");
        numeros.exibirNumeros();


    }
}
