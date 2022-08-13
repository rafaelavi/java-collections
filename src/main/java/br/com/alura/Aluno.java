package br.com.alura;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }


    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getNumeroMatricula() == aluno.getNumeroMatricula() && getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroMatricula());
    }

    @Override
    public String toString() {
        return "[Aluno: " + nome +
                ", Matricula: " + numeroMatricula + ']';
    }
}
