package exer8;

public class InvalidoException extends Exception {
    public InvalidoException(String mensagem) {
        super("Opera��o Inv�lida - " + mensagem + ".");
    }
}