package exer18;

public class Sedex implements Entrega {
    @Override
    public void entregar(String produto) {
        System.out.println("Entrega via sedex = " + produto + ", 24 horas.");
    }
}


