package exer5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exer5 {
    public static void main(String[] args) {
        // 1. Mostrar o compilador obrigando a tratar.
        // 2. Fazer o try manual.
        // 3. Ensinar o eclipse a gerar o try automático.
        // 4. Depurar uma leitura com erro e mostrar o printStackTrace();
        
        FileReader arquivo = null;
        try {
            arquivo = new FileReader("D:/fernando.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        BufferedReader leitor = new BufferedReader(arquivo);
        try {
            String conteudo = leitor.readLine();
            JOptionPane.showMessageDialog(null, "Conteudo do arquivo:\n" + conteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}


