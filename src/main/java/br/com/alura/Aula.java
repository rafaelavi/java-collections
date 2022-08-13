package br.com.alura;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[titulo: " + titulo  +
                ", tempo: " + tempo + "]";
    }

    @Override
    public int compareTo(Aula outra) {
        return this.titulo.compareTo(outra.titulo);
    }
}
