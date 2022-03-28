package Banco;

public abstract class Contas implements InterfaceConta{

    //protected static final int Agencia_Padrao = 1;
    // para poder acessar com as classes filhas;

    private static final int Agencia_Padrao = 1;
    private static int SEQUENCIAL = 0;


    public Contas() {
        this.agencia = Agencia_Padrao; // sempre mesma agencia
        this.numero = SEQUENCIAL++;
    }
    protected int agencia;
    protected int numero;
    private double saldo;
    /*
     public String titular;
     protected int limiteDeSaque;
    */

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void Sacar(double valor){
        //System.out.println("Sacar");
        saldo = saldo - valor;
    }
    public void Depositar(double valor){
        //System.out.println("Sacar");
        saldo = valor + saldo;

    }
    public void Transferir(double valor, Contas contaDestino){
        //System.out.println("Sacar");
        this.Sacar(valor); // sacar da conta que chama
        contaDestino.Depositar(valor);
    }
}
