package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public String nome;
    public int funcionarios;
    public int Totalclientes = 0;
    // se for privado cliente nao conseguira acessar
    protected static List<String> NomesClientes = new ArrayList<>();

    /*Banco(){
        // body of the constructor
        NomesClientes = new ArrayList<>();
    }*/

    public static void main(String[] args) {

        //Banco objBanco =  new Banco();
        String nome;
        System.out.println("Teste em banco");
        Scanner sc = new Scanner(System.in);
        System.out.println("When you done put X ");
        System.out.print("NAMES: ");

        while (sc.hasNextLine()) {
            Cliente c = new Cliente();
            String s = sc.nextLine();
            if (s.equals("X")) {
                break;
            } else {
                c.setNome(s);
            }
        }
        /*
        for(int i = 0; i < objBanco.NomesClientes.size(); i++){
            System.out.print(objBanco.NomesClientes.get(i) + " ");
        }*/
        for (int i = 0; i < NomesClientes.size(); i++) {
            System.out.print(NomesClientes.get(i) + " ");
        }
    }

}
