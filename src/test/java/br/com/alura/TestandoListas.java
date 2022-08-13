package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(aula1);

        aulas.forEach( aula -> System.out.println("Aula " + aula));

        String primeiraAula =  aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (String aula : aulas) {
            System.out.println("aula : " + aula);
        }

        aulas.add("Aumentando o nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("depois de ordenado");
        System.out.println(aulas);
    }
}
