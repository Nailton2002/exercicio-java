package exer15;

public class Forno {

    public void fabricar(Pizza pizza) {
        // pizza � uma referencia polim�rfica = vari�vel e din�mica.
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}


