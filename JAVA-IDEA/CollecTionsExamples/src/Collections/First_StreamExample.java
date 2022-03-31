package Collections;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class First_StreamExample {
    public static void main(String[] args) {
        List<String> numAleatorio =
                Arrays.asList("1", "3", "2", "101");

        System.out.println("imprime tudo");
        numAleatorio.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("Outro jeito..");

        // list ja tem um foreach imbutido

        /*
        numAleatorio.stream().forEach(s -> System.out.println(s));*/

        System.out.println("Sem o Stream pois List tem forEach..");
        //numAleatorio.forEach(s -> System.out.println(s));

        /*transformar num metodo de referencia */
        System.out.println("transformar num metodo de referencia");

        numAleatorio.stream().forEach(System.out::println);
        System.out.println("Set com stream");

        Set<String> collectSet =
                numAleatorio.stream().limit(2).collect(Collectors.toSet());

        System.out.println("Transformar a lista em num Inteiros" +
                "usando MAP");


        //lambda vira metodo reference
        List <Integer> c = numAleatorio.stream().
                map(Integer::parseInt).toList();


    }
}
