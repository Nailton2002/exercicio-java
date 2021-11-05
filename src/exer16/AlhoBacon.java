package exer16;

public class AlhoBacon implements Pizza {    
    @Override
    public void preparar() {
        System.out.println("molho, alho e muito bacon.");
    }
    
    @Override
    public void assar() {
        System.out.println("14  minutos.");
    }
    
    @Override
    public void cobrar() {
        System.out.println("R$ 15,50");
    }
}


