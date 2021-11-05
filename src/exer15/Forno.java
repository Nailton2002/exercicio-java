package exer15;

public class Forno {

    public void fabricar(Pizza pizza) {
        // pizza é uma referencia polimórfica = variável e dinâmica.
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}


