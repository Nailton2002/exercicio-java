package exer16;

public class Forno {
    public void fabricar(Pizza pizza) {
        // Uma única alteração no forno, altera todas as pizzas.
        System.out.println("Promoção: borda de catupiri.");
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}




