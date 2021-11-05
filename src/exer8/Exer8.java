package exer8;

public class Exer8 {
	public static void main2(String[] args) {
		Pessoa joao = new Pessoa();
		// 1. exemplo
		try {
			joao.calcularIdade(null, null);
		} catch (ObrigatorioException | InvalidoException e) {
			e.printStackTrace();
		}
		// 2. exemplo
		try {
			joao.calcularIdade(0, null);
		} catch (ObrigatorioException | InvalidoException e) {
			e.printStackTrace();
		}
		// 3. exemplo
		try {
			joao.calcularIdade(0, 0);
		} catch (ObrigatorioException | InvalidoException e) {
			e.printStackTrace();
		}
		// 4. exemplo
		try {
			joao.calcularIdade(1980, 1979);
		} catch (ObrigatorioException | InvalidoException e) {
			e.printStackTrace();
		}
		// 5. exemplo
		try {
			System.out.println("idade é = " + joao.calcularIdade(1980, 2016));
		} catch (ObrigatorioException | InvalidoException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Pessoa joao = new Pessoa();
		try {
			joao.calcularIdade(null, null);
		} catch (ObrigatorioException e) {
			e.printStackTrace();
		} catch (InvalidoException e) {
			e.printStackTrace();
		}
		try {
			joao.calcularIdade(0, null);
		} catch (ObrigatorioException e) {
			e.printStackTrace();
		} catch (InvalidoException e) {
			e.printStackTrace();
		}
		try {
			joao.calcularIdade(0, 0);
		} catch (ObrigatorioException e) {
			e.printStackTrace();
		} catch (InvalidoException e) {
			e.printStackTrace();
		}
		try {
			joao.calcularIdade(1980, 1979);
		} catch (ObrigatorioException e) {
			e.printStackTrace();
		} catch (InvalidoException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("idade é=" + joao.calcularIdade(1980, 1981));
			System.out.println("idade é=" + joao.calcularIdade(1980, 2016));
		} catch (ObrigatorioException e) {
			e.printStackTrace();
		} catch (InvalidoException e) {
			e.printStackTrace();
		}
	}
}
