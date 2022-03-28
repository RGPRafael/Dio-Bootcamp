package Programa2;

public class Programa2 {
        // A classe Main é onde o programa vai ser executado
        public static void main(String[] args) {
            // Calculadora
            System.out.println("Exercício calculadora");
            Calculadora.soma(3, 6); //Para chamar o método (passar uma mensagem) a partir da classe nesse caso calculadora
            //Classe.nome(parâmetro1, parâmetro2) - Precisamos passar esses parâmetros
            Calculadora.subtracao(9, 1.8);
            Calculadora.multiplicacao(7, 8);
            Calculadora.divisao(5, 2.5);

            // Mensagem
            System.out.println("Exercício mensagem");
            Mensagem.obterMensagem(9);
            Mensagem.obterMensagem(14);
            Mensagem.obterMensagem(1);

            // Empréstimo
            System.out.println("Exercício empréstimo");
            Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());// Foi criado para mostrar que é possível passar um parâmetros para outro método
            Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
            Emprestimo.calcular(1000, 5);

        }
}
