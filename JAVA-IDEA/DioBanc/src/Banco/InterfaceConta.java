package Banco;

public interface InterfaceConta {
    void Sacar(double valor);
    void Depositar(double valor);
    void Transferir(double valor, Contas contaDestino);
    void Extrato();
}
