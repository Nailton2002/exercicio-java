package exer7;

public class Pessoa {
    public int calcularIdade(Integer anoNasc, Integer anoAtual) throws Exception {
        if (anoNasc == null) {
            throw new Exception("Ano nascimento é obrigatório.");
        }
        if (anoAtual == null) {
            throw new Exception("Ano atual é obrigatório.");
        }
        if (anoAtual <= anoNasc) {
            throw new Exception("Ano atual deve ser maior que data nasc.");
        }
       return anoAtual - anoNasc;
    }
}

