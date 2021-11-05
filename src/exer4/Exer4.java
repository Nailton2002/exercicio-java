package exer4;

public class Exer4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        // Adicionando conteúdo
        str.append("Fernando");
        str.append(" Franzini");

        // obter conteúdo completo
        System.out.println(str.toString());

        // obter parte do conteúdo
        System.out.println(str.substring(4, 10));

        // verificar tamanho
        System.out.println(str.length());

        // deleter uma parte
        str = str.delete(8, str.length());
        System.out.println(str.toString());

        // deletar tudo
        str.delete(0, str.length());
        System.out.println("str=" + str.toString());        
    }
}



