package exer18;

public class Pac implements Entrega {
    @Override
    public void entregar(String produto) {
        System.out.println("Entrega via pac = " + produto + ", 15 dias de prazo.");
    }
}


