package exer14;

public class Forno {
    // 1 PARTE: Execute o programa tentando passar a napolitana no m�todo da
    // calabreza que � parte do aprendizado.
    public void fabricar(PizzaCalabresa calabreza) {
        calabreza.preparar();
        calabreza.assar();
        calabreza.cobrar();
    }

    // 2 PARTE: Crie o novo m�todo para fabricar napolitana e
    // conclua a explica��o.
    public void fabricar(PizzaNapolitana napolitana) {
        napolitana.preparacao();
        napolitana.assamento();
        napolitana.valor();
    }
}


