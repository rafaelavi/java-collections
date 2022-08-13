package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> fun = new TreeSet<>(new OrdenaPorIdade());
        fun.add(f1);
        fun.add(f2);
        fun.add(f3);

        Iterator<Funcionario> iterator = fun.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getNome());
        }
    }
}
