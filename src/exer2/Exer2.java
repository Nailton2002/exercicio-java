package exer2;

public class Exer2 {

	public static long somar(int v1, int v2) {
		return v1 + v2;
	}

	public static void main(String[] args) {
		System.out.println(somar(10, 10));
		// System.out.println(somar(10, 10, 10)); Não tem como fazer....

		System.out.println(adicionar(10, 10));
		System.out.println(adicionar(10, 10, 1));
		System.out.println(adicionar(10, 10, 1, 2));
		System.out.println(adicionar(10, 10, 1, 2, 3));
		System.out.println(adicionar(10, 10, 1, 2, 3, 4));
	}

	public static long adicionar(int... parans) {
		long res = 0;
		for (int i : parans) {
			res += i;
		}
		return res;
	}
}

