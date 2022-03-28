package Emprestimo;

public class Emprestimo {
    public static int getDuasParcelas() {
        //Visib/Modif/Retorno/Nome(parâmetro "no caso está sem parâmetro")
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {//Método principal
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());//Para mostrar que é possivel criar um método dentro de outro

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }
}