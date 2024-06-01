package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
         contas.add(conta);
    }

    public void clientes() {
        for (Conta c : contas) {
            System.out.println("Agencia: " + c.getAgencia());
            System.out.println("Nome do cliente: " + c.getCliente().getNome());
        }
    }
}
