package exer11;

public class Exer11 {
    public static void main(String[] args) {
        // 1. Chamada do metodo normal.
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();

        // 2. Chamadas polimorficas
        torcedor = new Corinthians();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();

        torcedor = new Santos();
        torcedor.torcer();
    }
}

