package lpoo.aula1;

import javax.swing.*;

public class Aula4 {

    public static void somaSub() {
        int soma = 0;
        for (int nun = 1256; nun <= 1278; nun++) {
            soma += nun;
        }
        JOptionPane.showMessageDialog(null, "O resultado final é: " + soma);
    }

    public static void quadrado() {
        int nun, quadrado;

        for (nun = 1; nun <= 10; nun++) {
            quadrado = nun * nun;
            JOptionPane.showMessageDialog(null, "O quadrado de " + nun + " é:" + quadrado);
        }
    }

    public static void aplicacao() {
        int periodo, contador = 1;
        float valor, juros;

        String leValor = JOptionPane.showInputDialog("Infome o valor a ser aplicado:");
        String lePeriodo = JOptionPane.showInputDialog("Informe o periodo da aplicação:");

        periodo = Integer.parseInt(lePeriodo);
        valor = Integer.parseInt(leValor);
        juros = (float) (valor * 0.1);

        while (contador <= periodo) {
            valor = valor + juros;
            JOptionPane.showMessageDialog(null, contador + "º mês: " + valor);
            juros = (float) (valor * 0.1);
            contador++;
        }
    }

    public static void resto() {
        int nun, soma = 0;

        for (nun = 160; nun <= 190; nun++) {
            if (nun % 2 == 0) {
                soma = nun + soma;
                JOptionPane.showMessageDialog(null, "A soma dos números pares no intervalor entre 160 a 190 é: " + soma);
            }
        }
    }

    public static void main(String[] args) {

        resto();
    }
}