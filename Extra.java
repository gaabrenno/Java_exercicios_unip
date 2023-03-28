package lpoo.aula1;

import javax.swing.*;

public class Extra {
    public static void telefone() {
        float juros, valorTelefone;
        int mes = 0, contador;

        String leValor = JOptionPane.showInputDialog("Informe o valor de sua conta telefonica:");
        valorTelefone = Float.parseFloat(leValor);
        juros = (float) (valorTelefone * 0.03);

        for (contador = 3; mes < contador; mes++) {
            valorTelefone = valorTelefone + juros;

            if (mes % 2 != 0) {
                System.out.println("O valor com juros no " + contador + "º mês é de: " + valorTelefone);
            }
            juros = (float) (valorTelefone * 0.03);

        }

        while (valorTelefone <= 160) {
            valorTelefone = valorTelefone + juros;
            juros = (float) (valorTelefone * 0.03);
            contador++;
            if (valorTelefone >= 160) {
                System.out.println("A partir do  " + contador + "º mês o valor será maior que R$160");
            }

        }

        while (valorTelefone <= valorTelefone * 2) {
            valorTelefone = valorTelefone + juros;
            juros = (float) (valorTelefone * 0.03);
            contador++;
            if (valorTelefone == valorTelefone * 2) {
                System.out.println("No mês  " + contador + " o valor terá dobrado, ou seja, estara a " + (valorTelefone * 2));
            }

        }

    }

    public static void main(String[] args) {
        telefone();
    }
}
