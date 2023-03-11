package lpoo.aula1;

import java.text.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

import static lpoo.aula1.Aula3.Pluralizador.pluralize;

public class Aula3 {
    public static void compra() {
        String produto;
        int quantidade;
        float valor, valort;

        produto = JOptionPane.showInputDialog("Informe o produto compro:");
        String lequantidade = JOptionPane.showInputDialog("Informe a quantidade de " + pluralize(produto) + " compros:");
        quantidade = Integer.parseInt(lequantidade);
        String levalor = JOptionPane.showInputDialog("Informe o valor unitario do produto:");
        valor = Float.parseFloat(levalor);
        valort = valor * quantidade;

        System.out.print("Você comprou " + quantidade + " unidade de " + produto + ", que está custando R$" + valor + ", no valor unitario! Você pagará: R$" + valort);

    }


    public static void main(String[] args) {
        compra();
    }


    public class Pluralizador {

        private static final Map<String, String> EXCECOES = new HashMap<>();
        static {
            EXCECOES.put("pão", "pães");
            EXCECOES.put("mão", "mãos");
            EXCECOES.put("cão", "cães");
            // Adicione aqui outras exceções conforme necessário
        }

        public static String pluralize(String palavra) {
            /*
             * Esta função recebe uma palavra no singular e retorna sua forma no plural em português.
             */
            if (palavra.endsWith("s") || palavra.endsWith("x") || palavra.endsWith("z") || palavra.endsWith("ch") || palavra.endsWith("sh")) {
                return palavra + "es";
            } else if (palavra.endsWith("ão")) {
                String radical = palavra.substring(0, palavra.length() - 2);
                char vogal = radical.charAt(radical.length() - 1);
                if (EXCECOES.containsKey(palavra)) {
                    return EXCECOES.get(palavra);
                } else if (vogal == 'ã') {
                    return radical.substring(0, radical.length() - 1) + "ãos";
                } else if (vogal == 'õ' || vogal == 'o') {
                    return radical + "ões";
                } else if (vogal == 'a') {
                    return radical + "ães";
                } else {
                    return palavra + "s";
                }
            } else if (palavra.endsWith("r") || palavra.endsWith("s") || palavra.endsWith("z")) {
                return palavra + "es";
            } else if (palavra.endsWith("l")) {
                return palavra.substring(0, palavra.length() - 1) + "is";
            } else if (palavra.endsWith("m")) {
                return palavra.substring(0, palavra.length() - 1) + "ns";
            } else if (palavra.endsWith("n")) {
                return palavra.substring(0, palavra.length() - 1) + "ns";
            } else if (palavra.endsWith("al")) {
                return palavra.substring(0, palavra.length() - 2) + "ais";
            } else if (palavra.endsWith("il")) {
                return palavra.substring(0, palavra.length() - 2) + "is";
            } else {
                return palavra + "s";
            }
        }
    }

}