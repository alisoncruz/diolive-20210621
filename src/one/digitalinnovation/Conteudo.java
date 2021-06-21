package one.digitalinnovation;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10.0;

    private String titulo;
    private String educacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEducacao() {
        return educacao;
    }

    public void setEducacao(String educacao) {
        this.educacao = educacao;
    }

    public abstract double calcularXp();
}
