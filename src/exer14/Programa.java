package exer14;

public class Programa {
	public static void main(String[] args) {
		Forno forno = new Forno();

		PizzaCalabresa calabresa = new PizzaCalabresa();
		forno.fabricar(calabresa);

		PizzaNapolitana napolitana = new PizzaNapolitana();
		// Deixe o erro de compilação acontencer.
		forno.fabricar(napolitana);
	}
}


