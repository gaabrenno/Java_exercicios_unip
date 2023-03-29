package lpoo.aula1;

import javax.swing.*;

public class Extra {

    public static void estagio() {
        int semanas;
        float valorHoras, valorDias, valorSemana, valorSalario;

        String nome = JOptionPane.showInputDialog("Insira o nome do estagiario:");
        String leValorHoras = JOptionPane.showInputDialog("Insira o valor de uma hora trabalhada:");
        valorHoras = Float.parseFloat(leValorHoras);

        valorDias = valorHoras * 4;
        valorSemana = (valorDias * 5) + 50;
        String leSemanas = JOptionPane.showInputDialog("Insira a quantidade de semanas a ser caulculado:");
        semanas = Integer.parseInt(leSemanas);
        valorSalario = semanas * valorSemana;

        JOptionPane.showMessageDialog(null, nome + " receberá R$" + valorSalario + "!");


    }

    public static void viagem() {
        float orc1[] = new float[2];
        float orc2[] = new float[2];
        float diariaOrc1, diariaOrc2;
        int diaria;

        String destino = JOptionPane.showInputDialog("Insira seu destino:");
        for (int contador = 0; contador < 2; contador++) {
            String leOrc1 = JOptionPane.showInputDialog("Insira o valor da fidelidade e da diaria do 1º orçamento:");
            orc1[contador] = Float.parseFloat(leOrc1);
        }

        for (int contador = 0; contador < 2; contador++) {
            String leOrc2 = JOptionPane.showInputDialog("Insira o valor da fidelidade e da diaria do 2º orçamento:");
            orc1[contador] = Float.parseFloat(leOrc2);
        }
        String lediaria = JOptionPane.showInputDialog("Quantos dias passará em" + destino + "?");
        diaria = Integer.parseInt(lediaria);

        diariaOrc1 = orc1[1] * diaria;
        diariaOrc2 = orc2[1] * diaria;

        float totalOrc1 = diariaOrc1 + orc1[0];
        float totalOrc2 = diariaOrc2 + orc2[0];

        if (totalOrc1 < totalOrc2) {
            JOptionPane.showMessageDialog(null, "O primeiro orçamento esta saindo R$" + (totalOrc1 - totalOrc2) + "mais barato que o segundo!");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo orçamento esta saindo R$" + (totalOrc1 - totalOrc2) + "mais barato que o primeiro!");
        }

    }

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

        while (valorTelefone < (valorTelefone * 2)) {
            valorTelefone = valorTelefone + juros;
            juros = (float) (valorTelefone * 0.03);
            contador++;
            if (valorTelefone < (valorTelefone * 2)) {
                System.out.println("No mês  " + contador + " o valor terá dobrado, ou seja, estara a " + (valorTelefone * 2));
            }

        }

    }

    public static void dAq() {
        int nun, dobro, triplo, quadruplo, quinduplo;

        String leNun = JOptionPane.showInputDialog("Insira um número aleatorio:");
        nun = Integer.parseInt(leNun);

        dobro = nun * 2;
        triplo = nun * 3;
        quadruplo = nun * 4;
        quinduplo = nun * 5;

        JOptionPane.showMessageDialog(null, "O dobro, triplo, quadruplo e quinduplo de " + nun + " é: " + dobro + ", " + triplo + ", " + quadruplo + " e " + quinduplo + " consecutivamente!");
    }


    public static void resultadoArray() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                resultado += numeros[i];
            } else {
                resultado -= numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"O resultado de 1-2+3-4+5-6+7-8+9-10 é: "+resultado);
    }


    public static void main(String[] args) {
        resultadoArray();
    }
}
