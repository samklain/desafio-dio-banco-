package contas;

import Interfac.InterfaceBanco;
import lombok.Getter;

@Getter
public abstract class Conta implements InterfaceBanco {
    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 01;

    protected String nomeCliente;
    protected int telefone;
    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void dadosCliente(String nomeCliente, int telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefoneCliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.sacar(valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    protected void imprimirInfo() {

        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Telefone: %d", this.telefone));
        System.out.println("Nome Cliente: " + this.nomeCliente);
    }



}
