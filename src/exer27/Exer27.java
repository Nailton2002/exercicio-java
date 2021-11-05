package exer27;

public class Exer27 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Donwload());
        Thread t2 = new Thread(new Lista());
        Thread t3 = new Thread(new Relatorio());
        t1.start();
        t2.start();
        t3.start();
    }
}

