package Collections;

import java.util.*;

public class ExampleMap {

    /*
     modelos de carros e valor
     */
    public static void main(String[] args) {


        Map<String, Double> carrospopulares = new HashMap<>() {{
            put("fiesta", 119.0);
            put("gol", 14.1);
            put("uno", 15.4);
            put("hb20", 9.0);
            put("hb21", 19.0);
            put("hb211", 119.0);


        }};
        System.out.println("Sem o toString:" + carrospopulares);
        System.out.println(carrospopulares.toString());
        System.out.println("alterando valor de chave valor anterior: "+ carrospopulares.put("gol", 292.0));
        System.out.println(carrospopulares.toString());
        System.out.println("checando se ha um carro tucson "+ carrospopulares.containsKey("tucson"));
        System.out.println("checando se ha um carro gol "+ carrospopulares.containsKey("gol"));
        System.out.println("Exiba os modelos... ");
        Set<String> modelos =  carrospopulares.keySet();

        System.out.println("add chave: "+ carrospopulares.put("Celta", 292.0));

        System.out.println("retorne os valores dos carros");
        Collection<Double> consumos = carrospopulares.values();
        System.out.println(consumos);

        System.out.println("VAlor max: ");
        Double max = Collections.max(consumos);
        //retorna um set com elementos do tipo posto entre <>
        Set<Map.Entry<String, Double>> entries = carrospopulares.entrySet();
        String modelocomvalorMax = "";
        for ( Map.Entry<String,Double> entry: entries){
            if(entry.getValue().equals(max)){
                modelocomvalorMax = entry.getKey();
                System.out.println(modelocomvalorMax);

            }
        }
        // pesquisar sobre
        Iterator<Double> iterator = carrospopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma = soma + iterator.next();
        }
        System.out.println("SOMA dos consumos....: " + soma);
        // apagar tudo :clear
        // checar se esta vazio : isEmpty
    }

    class OrdenaçãoExemplo {
        public void main(String[] args) { // why can not be static ?


            Map<String, Livro> meus_livros = new HashMap<>();
            meus_livros.put("Sthephen King", new Livro("The thing", 990));
            meus_livros.put("SomeOne", new Livro("Player Number 1", 390));
            meus_livros.put("Dostoiviesk", new Livro("O idiota", 500));



            //ordenar por numeros de paginas...
        }
    }

    class Livro{
        private String nome;
        private Integer paginas;

        public Livro(String nome, Integer paginas) {
            this.nome = nome;
            this.paginas = paginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getPaginas() {
            return paginas;
        }

        public void setPaginas(Integer paginas) {
            this.paginas = paginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", paginas=" + paginas +
                    '}';
        }
    }
}


// exercicios propostas:
/*
* dada a pop estimada de alguns estados do ne br
* fazer um dicionairo e relacionar os estados e suas
* populacoes substituir a populacao do estado do RN
* por 3534165
*
* conferir se o estado de PB esta no dic caso nao add
* PB = 4039277 e exibir a pop de PE
* exibir tds os estados e suas pop na ordem em que foi
* informado
* exiba os estados e suas pop em ordem alfabetica
* exiba os estados com a menor pop e sua quantidade
* exiba o estado com maior pop e sua quantidade
* exiba a soma da pop desses estados
* exiba a media da pop deste dici de estados
* remova os estados com a pop menor que 4.000.000
* apague o diciionario de estados e confira se esta
* vazio
* PE = 9616621
* AL = 3351543
* CE = 9187103
* RN = 3534265
*
*
*
*
*
*
* Fazer um programa que simule um lancamento de dados
* lance o dado 100 vezes e armazene
* depois mostre quantas vezes cada valor foi inserido
*
*  */
