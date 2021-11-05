package exer6;

import java.io.File;

public class Exer6 {

	public static void main(String[] args) {
		// 1. Fazer e executar com try
		String nome = null;
		try {
			File arquivo = new File(nome);
			System.out.println(arquivo);
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("não abriu o arquivo");
		}
		System.out.println("continua o programa...");
		try {
			int res = 10 / 0;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("não fez a operação");
		}
		System.out.println("continua o programa...");
	}

	public static void main2(String[] args) {
		// 2. Fazer e executar sem try
		String nome = null;
		File arquivo = new File(nome);
		System.out.println(arquivo);
		System.out.println("continua o programa...");
		int res = 10 / 0;
		System.out.println("continua o programa...");
	}
}


