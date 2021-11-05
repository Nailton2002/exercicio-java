package exer3;

public class Exer3 {

    public static void main(String[] args) {
        // Java 1.4
        Integer v1 = new Integer(10);
        int dez = v1.intValue();
        System.out.println(dez);
        int soma  = 1 + v1.intValue() + 3;
        System.out.println(soma);

        // Java 5.0
        Integer o1 = 10; // autobox
        int v2 = o1; //unbox
        
        int total = 10 + o1 + v2; // unbox e autobox
        System.out.println(total);
        
        Double x = 1.50;
        for (int i = 0; i < 10; i++) {
            x++;
        }
        System.out.println(x);
    }
}