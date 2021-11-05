package exer14;

public class Forno {
    // 1 PARTE: Execute o programa tentando passar a napolitana no método da
    // calabreza que é parte do aprendizado.
    public void fabricar(PizzaCalabresa calabreza) {
        calabreza.preparar();
        calabreza.assar();
        calabreza.cobrar();
    }

    // 2 PARTE: Crie o novo método para fabricar napolitana e
    // conclua a explicação.
    public void fabricar(PizzaNapolitana napolitana) {
        napolitana.preparacao();
        napolitana.assamento();
        napolitana.valor();
    }
}


