package exer18;

public class Exer18 {
    public static void main(String[] args) {
        Compra dvd = new Compra(new Pac());
        dvd.comprar("Hobbit 1");

        Compra livro = new Compra(new Sedex());
        livro.comprar("Use a cabeça Java");
    }
}



