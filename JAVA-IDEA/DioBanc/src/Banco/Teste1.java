package Banco;

public class Teste1 {

    public static void main(String[] args) {
        Contas cc = new ContaCorrente();
        Contas p  = new ContaPopanca();

        cc.Extrato();
        p.Extrato();

        cc.Depositar(100.0);
        cc.Extrato();
        cc.Transferir(50.0, p);
        cc.Extrato();
        p.Extrato();

    }
}
