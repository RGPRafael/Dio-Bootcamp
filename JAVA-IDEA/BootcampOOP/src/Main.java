import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("MAC0110");
        curso.setDescricao("Intro a Prog");
        curso.setCargaHoraria(90);
        System.out.println( curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("MAC0110 - mentoria Roberto");
        mentoria.setDescricao("Intro a Prog");
        mentoria.setCargaHoraria(90);
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        // apos as modificações em curso e mentoria
        // que herdam atributos de conteudo
        // prestar atenção com o que podemos fazer com
        // polimorfismo


        // com polimorfismo é possivel criar uma instancia da classe
        //filha por meio de uma classe pai...
        Conteudo conteudo = new Curso();





    }
}
