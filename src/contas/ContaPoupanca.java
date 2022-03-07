package contas;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Extrato Conta Poupança");
        imprimirInfo();
    }
}
