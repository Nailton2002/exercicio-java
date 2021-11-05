package exer19;

import java.util.ArrayList;

public class Exer19 {

    public static void main(String[] args) {
        ArrayList<String> colecao = new ArrayList<>();
        // List<String> colecao = new ArrayList<>(); //ou polimorfico

        // verificando tamanho
        System.out.println(colecao.size());

        // Adicionando
        colecao.add("Fernando");
        colecao.add("Rebeca");
        colecao.add("Anny");
        colecao.add("Jonas");
        // verificando tamanho
        System.out.println(colecao.size());

        // Iterando nos conteudo, ordenado pela inserção
        System.out.println("--> iteração 1");
        for (String item : colecao) {
            System.out.println(item);
        }

        // permite duplicado
        colecao.add("Fernando");

        // Iterando nos conteudo, ordenado pela inserção
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

        // Iterando nos conteudo, ordenado pela inserção
        System.out.println("--> iteração 3");
        for (String item : colecao) {
            System.out.println(item);
        }

        // Acessar por indice
        System.out.println("indice 1=" + colecao.get(1));
        System.out.println("indice 2=" + colecao.get(2));

        // limpar tudo
        colecao.clear();
        System.out.println(colecao.size());
    }
}



