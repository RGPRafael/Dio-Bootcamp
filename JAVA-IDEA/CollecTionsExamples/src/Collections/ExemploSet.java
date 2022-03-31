package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        /* ver outras inicializações */
        Set<Double> notas;
        notas = new HashSet<>();
        // fazer na mao e fazer tudo de uma vez
        //notas.add( ( 1.0, 2.0,2.2,0.0,9.0,0.9,1.0,2.0,8.9) ;);
        /* metodos explorados
        Collections.min(notas)
        notas.contains
        Collections.max()
        notas.remove();
        remover na posicao:
        remover as notas que sao < 7
            usar iterator
        exibir as notas na ordem em que foi posta
            com hashset nao da
            usar com linkedhasset

        exibir notas em ordem crescente
            usar treeSet

         apagar conjunto
         notas.clear();

         */

        Double soma;
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
             soma = next;
        }
    }
    //ordenaçao com set
    class serie{
        private String nome;
        private String genero;
        private Integer tempo;

        public serie(String nome, String genero, Integer tempo ){
            this.nome = nome;
            this.genero = genero;
            this.tempo = tempo;

        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempo() {
            return tempo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setTempo(Integer tempo) {
            this.tempo = tempo;
        }

    }

}


/*
 EX1
 cria um conjunto contendo as cores do arco iris
exiba todas as cores uma abaixo da outra
a quant de cores qo arco iris tem
exiba as cores em ordem alfabetica
exiba as cores na ordem inversa da que foi informada
exiba todas as cores que nao comecam com aletra v
limpe o conj
confira se o conjunto esta vazio





EX2:
cria uma classe linguagem Favorita que possua os
atributos nome
ano de criaçã e ide
em seguida cria um conjunto com 3 linguagens e faca um progrma que
ordene esse conj por:
ordem de insercao
ordem natural
ide
ano de criacao e nome
nome e anode criacao e Ide


*/
