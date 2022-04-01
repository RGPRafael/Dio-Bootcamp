package dominio;

public abstract class Conteudo {
    protected static final double XP_Padrao = 10d;
    // modif de acess constante tipo nome da variavel
    private String titulo;
    private String descricao;

    //obrigacao de implementar Xp
    public abstract double calcularXp();
    // abstract : eu nao consigo criar conteudo se nao
    // implementar calcular xp


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
