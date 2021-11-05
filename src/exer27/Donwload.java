package exer27;

public class Donwload implements Runnable {
    public void run() {
        for (int i = 0; i <= 500; i++) {
            System.out.println("Processamento donwload " + i + "%");
        }
    }
}


