package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    public Mentoria() {
        super();
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: " +
                "Título= " + getTitulo() + "\n" +
                "Descricao= " + getDescricao() + "\n" +
                "Data= " + data;
    }
}
