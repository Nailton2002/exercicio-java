package exer20;

import java.util.HashSet;

public class Exer20 {

    public static void main(String[] args) {
        HashSet<String> colecao = new HashSet<>();
        //Set<String> colecao = new HashSet<>(); //ou polimorfico

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

        // Iterando nos conteudo, sem regra de ordenção, pode variar de OS e JDK.
        System.out.println("--> iteração 1");
        for (String item : colecao) {
            System.out.println(item);
        }

        // Não permite duplicado
        System.out.println(colecao.add("Fernando"));

        // Iterando nos conteudo, sem regra de ordenção, pode variar de OS e JDK.
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

        // Iterando nos conteudo, sem regra de ordenção, pode variar de OS e JDK.
        System.out.println("--> iteração 3");
        for (String item : colecao) {
            System.out.println(item);
        }

        // limpar tudo
        colecao.clear();
        System.out.println(colecao.size());
    }
}

