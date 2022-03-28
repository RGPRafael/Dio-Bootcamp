package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class First_List {
    public static void main(String[] args) {
        //Creating a List
        java.util.List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " , ");
        }
        System.out.println("size of list : " + list.size());
        System.out.println("rodando um exemplo de ExemploList..");
        ExemploList l = new ExemploList();
        l.exemplonotas();

        Ordenacao ord = new Ordenacao();
        ord.main();
    }
}

class ExemploList {
    public static void main(String[] args) {

    }

    public void exemplonotas(){
        java.util.List<Double> notas = new ArrayList<Double>();
        notas.add(4.1);
        notas.add(4.2);
        notas.add(9.0);
        notas.add(9.1);
        notas.add(0.1);
        notas.add(9.7);
        notas.add(9.9);
        notas.add(9.3);
        notas.add(9.12);
        notas.add(7.12);

        System.out.println(notas.toString());

    }
}


/* Java ArrayList class uses a dynamic array for storing the elements.
It is like an array, but there is no size limit.
We can add or remove elements anytime.
So, it is much more flexible than the traditional array.
It is found in the java.util package. It is like the Vector in C++.
The ArrayList maintains the insertion order internally. */
class ExemploArrayList{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
    }
}

class gato implements Comparable<gato> {
    private String nome;
    private String cor;
    private int idade;

    public gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(gato g) {
        return this.getNome().compareToIgnoreCase(g.getNome());
    }
}


class Ordenacao{
    public static void main() {
        List <gato> gatos = new ArrayList<>();
        gatos.add(new gato("SIMBA","Preto",12));
        gatos.add(new gato("SCAR","PRETO",19));
        gatos.add(new gato("MEG","PRETO",19));
        gatos.add(new gato("EG","PRETO",19));


        System.out.println("ordem de insercao");
        System.out.println(gatos); // reescrever tostring para nao mostrar endMem


        System.out.println("Bagunçando a lista usando o pai collection");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("ordem natural");
        Collections.sort(gatos);
        System.out.println(gatos);


    }

}