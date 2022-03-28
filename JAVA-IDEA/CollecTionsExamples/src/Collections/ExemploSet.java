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
}
