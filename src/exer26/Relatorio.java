package exer26;

public class Relatorio extends Thread {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("Enviando relatorio financeiro " + i + "%");
        }
    }
}


