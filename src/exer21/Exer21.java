package exer21;

import java.util.HashSet;
import java.util.Set;

public class Exer21 {
    
    public static void main(String[] args) {
        //TreeSet<String> colecao = new TreeSet<>();
        Set<String> colecao = new HashSet<>(); //ou polimorfico

        // verificando tamanho
        System.out.println(colecao.size());

        // Adicionando
        colecao.add("Fernando");
        colecao.add("Rebeca");
        colecao.add("Anny");
        colecao.add("Jonas");
        colecao.add("Fabio");
        colecao.add("Junior");

        // verificando tamanho
        System.out.println(colecao.size());

        // Iterando nos conteudo, usa regra de ordenação por ordem alf em string.
        System.out.println("--> iteração 1");
        for (String item : colecao) {
            System.out.println(item);
        }

        // Não permite duplicado
        System.out.println(colecao.add("Fernando"));

        // Iterando nos conteudo, usa regra de ordenação por ordem alf em string.
        System.out.println("--> iteração 2");
        for (String item : colecao) {
            System.out.println(item);
        }

        // procurando um item
        System.out.println(colecao.contains("Rebeca"));
        System.out.println(colecao.contains("Neymar"));

        // remove itens
        System.out.println(colecao.remove("Rebeca"));
        System.out.println(colecao.remove("Adriano"));

        // Iterando nos conteudo, usa regra de ordenação por ordem alf em string.
        System.out.println("--> iteração 3");
        for (String item : colecao) {
            System.out.println(item);
        }

        // limpar tudo
        colecao.clear();
        System.out.println(colecao.size());
    }
}



