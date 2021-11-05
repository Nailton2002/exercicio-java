package exer27;

public class Relatorio  implements Runnable {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("Enviando relatorio financeiro " + i + "%");
        }
    }
}


