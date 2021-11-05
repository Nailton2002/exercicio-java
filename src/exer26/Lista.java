package exer26;

public class Lista extends Thread {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("Atualizando a lista preço " + i + "%");
        }
    }
}


