package Interfac;

import contas.Conta;

public interface InterfaceBanco {

    public void dadosCliente(String nomeCliente, int telefoneCliente);

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Conta contaDestino);

    public void imprimirExtrato();


}
