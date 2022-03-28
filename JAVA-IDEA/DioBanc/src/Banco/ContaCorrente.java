package Banco;

public class ContaCorrente extends Contas{

    //private static int SEQUENCIAL = 0;
    // tem relacao com a classe nao com objeto
    public void Extrato(){
        System.out.println("Ag:" + super.agencia + " " +
                "Num:" + super.numero + " " + "Saldo:" +getSaldo());
    }

}
