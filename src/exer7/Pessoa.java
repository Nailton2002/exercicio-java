package exer7;

public class Pessoa {
    public int calcularIdade(Integer anoNasc, Integer anoAtual) throws Exception {
        if (anoNasc == null) {
            throw new Exception("Ano nascimento � obrigat�rio.");
        }
        if (anoAtual == null) {
            throw new Exception("Ano atual � obrigat�rio.");
        }
        if (anoAtual <= anoNasc) {
            throw new Exception("Ano atual deve ser maior que data nasc.");
        }
       return anoAtual - anoNasc;
    }
}

