package exer8;

public class ObrigatorioException extends Exception {
    public ObrigatorioException(String campo) {
        super("Campo obrigat�rio - " + campo + ".");
    }
}


