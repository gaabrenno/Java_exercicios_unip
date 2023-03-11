package lpoo.aula1;

import java.text.*;
import java.io.*;
import javax.swing.JOptionPane;


public class Aula3 {
    public static void compra() {
        String produto;
        int quantidade;
        float valor, valort;

        produto = JOptionPane.showInputDialog("Informe o produto compro:");
        String lequantidade = JOptionPane.showInputDialog("Informe a quantidade de "+pluralize(produto)+" compros:");
        quantidade = Integer.parseInt(lequantidade);
        String levalor = JOptionPane.showInputDialog("Informe o valor unitario do produto:");
        valor = Float.parseFloat(levalor);
        valort = valor * quantidade;

        System.out.print("Você comprou "+quantidade+" unidade de "+produto+", que está custando R$"+valor+", no valor unitario! Você pagará: R$"+valort);

    }


    public static void main(String[] args) {
        compra();
    }

    public static String pluralize(String singular) {
        String plural = singular;
        if (singular.endsWith("ão")) {
            plural = singular.substring(0, singular.length() - 2) + "ões";
        } else if (singular.endsWith("ês") || singular.endsWith("is")) {
            plural = singular + "es";
        } else if (singular.endsWith("l") || singular.endsWith("n") || singular.endsWith("r")) {
            plural = singular + "es";
        } else if (singular.endsWith("m")) {
            plural = singular.substring(0, singular.length() - 1) + "ns";
        } else if (singular.endsWith("s")) {
            plural = singular;
        } else {
            plural = singular + "s";
        }
        return plural;
    }
}