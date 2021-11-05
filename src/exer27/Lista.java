package exer27;

public class Lista  implements Runnable {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("Atualizando a lista preço " + i + "%");
        }
    }
}


