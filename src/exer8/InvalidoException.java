package exer8;

public class InvalidoException extends Exception {
    public InvalidoException(String mensagem) {
        super("Operação Inválida - " + mensagem + ".");
    }
}