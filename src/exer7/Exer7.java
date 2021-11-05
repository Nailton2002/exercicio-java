package exer7;

public class Exer7 {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        // 1. exemplo
        try {
            joao.calcularIdade(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2. exemplo
        try {
            joao.calcularIdade(0, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 3. exemplo
        try {
            joao.calcularIdade(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 4. exemplo
        try {
            joao.calcularIdade(1980, 1979);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 5. exemplo
        try {
            System.out.println("idade é = " + joao.calcularIdade(1980, 1981));
            System.out.println("idade é = " + joao.calcularIdade(1980, 2016));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

