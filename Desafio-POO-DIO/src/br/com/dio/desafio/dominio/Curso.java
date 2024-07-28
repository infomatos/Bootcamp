package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao) {
        super(titulo, descricao);
    }

    public Curso() {
        super();

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    @Override
    public String toString() {
        return "Curso: \n" +
                "Título= " + getTitulo()  +
                ", Descricao= " + getDescricao() +
                ", CargaHoraria= " + cargaHoraria +
                "h";
    }
}
