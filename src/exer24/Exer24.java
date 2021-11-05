package exer24;

import java.util.LinkedList;

public class Exer24 {

    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        // Queue<String> fila = new LinkedList<>(); // ou polimorfico

        // verificando tamanho
        System.out.println(fila.size());

        // Adicionando
        fila.add("Fernando");
        fila.add("Rebeca");
        fila.add("Anny");
        fila.add("Jonas");
        
        // verificando tamanho
        System.out.println(fila.size());

        // Iterando nos conteudo, ordenado pela inserção
        System.out.println("--> iteração 1");
        for (String item : fila) {
            System.out.println(item);
        }

        // permite duplicado
        fila.add("Fernando");

        // Iterando nos conteudo, ordenado pela inserção
        System.out.println("--> iteração 2");
        for (String item : fila) {
            System.out.println(item);
        }

        // procurando um item
        System.out.println(fila.contains("Rebeca"));
        System.out.println(fila.contains("Neymar"));

        // remove itens
        System.out.println(fila.remove("Rebeca"));
        System.out.println(fila.remove("Adriano"));

        // Iterando nos conteudo, ordenado pela inserção
        System.out.println("--> iteração 3");
        for (String item : fila) {
            System.out.println(item);
        }

        // Processando a fila, pega o elemento e ja remove.
        System.out.println("--> Processando a fila");
        String item = null;
        while ((item = fila.poll()) != null) {
            System.out.println("fila=" + item);
        }
        System.out.println(fila.size());
    }
}


