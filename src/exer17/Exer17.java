package exer17;

public class Exer17 {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.vender(new Dinheiro(), 100.00);
        venda.vender(new CartaoCredito(), 100.00);
        venda.vender(new Boleto(), 100.00);
    }
}



