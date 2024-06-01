package application;

import entities.*;

public class Main {
    public static void main(String[] args) {

        Banco santander = new Banco("Santander");

        Cliente igor = new Cliente();
        igor.setNome("Igor");

        Conta cc = new ContaCorrente(igor);
        Conta cp = new ContaPoupanca(igor);


        santander.setContas(cc);
        santander.setContas(cp);
        santander.clientes();

    }
}
