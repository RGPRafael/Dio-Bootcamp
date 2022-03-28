package Collections;
import java.util.*;


public class PrimeiraCollection {
    public static void main(String[] args) {
        //Creating a List
        List<String> list=new ArrayList<String>();
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
    }
}

class ExemploList {
    public static void main(String[] args) {

    }

    public void exemplonotas(){
        List<Double> notas = new ArrayList<Double>();
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