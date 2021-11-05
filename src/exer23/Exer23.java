package exer23;

import java.util.LinkedHashMap;

public class Exer23 {
    
    public static void main(String[] args) {
        LinkedHashMap<String, String> mapa = new LinkedHashMap<>();
        //Map<String, String> mapa = new LinkedHashMap<>(); // polimorfico

        // Adicionar chave
        mapa.put("tia", "Michele Ferreira");
        mapa.put("pai", "Fernando Franzini");
        mapa.put("mae", "Anny Carla");
        mapa.put("filha", "Rebeca Galdiano");
        mapa.put("cachorro", "Spot");


        // verificando tamanho
        System.out.println(mapa.size());

        // Buscando objetos por sua chave
        System.out.println(mapa.get("filha"));
        System.out.println(mapa.get("primo"));

        // Mapa não foi criado para ser iterado, e sim acessados pela chave.
        // mas a api disponibiliza .values() que converte o mapa em uma List.
        // Iterando nos conteudo, mantem a ordem de inserção..
        System.out.println("--> iteração 1");
        for (String item : mapa.values()) {
            System.out.println(item);
        }

        // Não permite chaves duplicação, é sobreposto.
        mapa.put("cachorro", "fofão");

        System.out.println("--> iteração 2");
        for (String item : mapa.values()) {
            System.out.println(item);
        }

        // Remover chaves
        mapa.remove("cachorro");

        System.out.println("--> iteração 3");
        for (String item : mapa.values()) {
            System.out.println(item);
        }

        // iterando via chaves, que retorna as chaves existentes.
        System.out.println("--> iteração 4");
        for (String item : mapa.keySet()) {
            System.out.println("chave=" + item + ", objeto=" + mapa.get(item));
        }

        // Verificar se contem a chave
        System.out.println(mapa.containsKey("filha"));
        System.out.println(mapa.containsKey("primo"));

        // Verificar se contem o objeto
        System.out.println(mapa.containsValue("Fernando Franzini"));
        System.out.println(mapa.containsKey("Ricardo Silva"));

        // limpar tudo
        mapa.clear();
        System.out.println(mapa.size());
    }
}


