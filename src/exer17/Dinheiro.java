package exer17;

public class Dinheiro implements TipoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro. Não tem taxa!");
    }
}


