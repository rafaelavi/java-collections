package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        alunos.forEach(System.out::println);

        System.out.println(alunos);

    }
}
