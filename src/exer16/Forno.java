package exer16;

public class Forno {
    public void fabricar(Pizza pizza) {
        // Uma �nica altera��o no forno, altera todas as pizzas.
        System.out.println("Promo��o: borda de catupiri.");
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}




