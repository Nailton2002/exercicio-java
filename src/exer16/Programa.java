package exer16;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        AlhoBacon alhoBacon = new AlhoBacon();
        
        forno.fabricar(calabresa);
        forno.fabricar(napolitana);
        forno.fabricar(alhoBacon);
    }
}

