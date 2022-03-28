package Banco;

import java.util.Scanner;

public class Cliente extends Banco {
    private String nome;
    public String cpf;
    public String rg;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
        Totalclientes++;
        NomesClientes.add(this.nome);

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("When you done put X ");
        System.out.print("NAME: ");
        while(sc.hasNextLine()){
            Cliente c = new Cliente();
            System.out.print("NAME: ");
            String s = sc.nextLine();
            if(s.equals("X")) break;
            else c.setNome(s);
        }
        for(int i = 0; i < NomesClientes.size(); i++){
            System.out.print(NomesClientes.get(i) + " ");
        }
    }

}
