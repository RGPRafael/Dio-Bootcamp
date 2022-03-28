package Banco;

public class ContaPopanca extends Contas{


    // Contas é abstratc
    public void Extrato(){
        System.out.println("Ag:" + super.agencia + " " +
                "Num:" + super.numero +" " + "Saldo:" +getSaldo());
    }
}
