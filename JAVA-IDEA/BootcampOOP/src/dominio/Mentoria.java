package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { // filha de conteudo
    // private String titulo;
    // private String descrição;
    private int cargaHoraria;
    private LocalDate data;


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }

    public Mentoria(){

    }

    @Override
    public double calcularXp() {
        return XP_Padrao + 20;
    }

/*   como é filha de conteudo isso acaba sendo desnecessario..

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
*/

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
