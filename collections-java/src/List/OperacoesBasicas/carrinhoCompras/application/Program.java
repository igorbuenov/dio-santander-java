package List.OperacoesBasicas.carrinhoCompras.application;

import List.OperacoesBasicas.carrinhoCompras.entities.CarrinhoDeCompras;

public class Program {
    public static void main(String[] args) {


        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Headset Ravit", 140.0, 1);
        carrinhoDeCompras.adicionarItem("Soundbar Risemode", 66.90, 1);
        carrinhoDeCompras.adicionarItem("Monitor LG Ultragear", 700.0, 2);
        carrinhoDeCompras.adicionarItem("Teclado Keychron k3", 434.0, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println(String.format("Valor total da compra: R$ %.2f", carrinhoDeCompras.calcularValorTotal()));
        System.out.println();

        carrinhoDeCompras.removerItem("Headset Ravit");
        carrinhoDeCompras.exibirItens();
        System.out.println(String.format("Valor total da compra: R$ %.2f", carrinhoDeCompras.calcularValorTotal()));



    }
}
