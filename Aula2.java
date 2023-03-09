package lpoo.aula1;

import javax.swing.JOptionPane;

public class Aula2 {
    public static void quantIrmaos() {
        int irmaos;

        String leIrmaos = JOptionPane.showInputDialog("Insira a quantidade de irmãos");
        irmaos = Integer.parseInt(leIrmaos);

        if (irmaos >= 2) {
            System.out.print("Você terá desconto de 10%!");
        } else {
            System.out.print("Que pena! Você não terá desconto!");
        }
    }

    public static void turma() {
        int quanTurma;

        String lequanTurma = JOptionPane.showInputDialog("Insira a quantidade de alunos na nurma:");
        quanTurma = Integer.parseInt(lequanTurma);

        if (quanTurma > 30) {
            System.out.print("Parabêns! Sua turma tem " + quanTurma + " alunos. Vocês irão para Cancun!");
        } else if (quanTurma == 30) {
            System.out.print("Parabêns! Sua turma tem " + quanTurma + " alunos. Vocês irão para Fortaleza!");
        } else {
            System.out.print("Parabêns! Sua turma tem " + quanTurma + " alunos. Vocês irão para Caldas Novas!");
        }
    }

    public static void desconto() {
        float desc, valor;

        String leValor = JOptionPane.showInputDialog("Insira o valor da compra:");
        valor = Float.parseFloat(leValor);

        if (valor > 150.00) {
            desc = (float) (valor - (valor * 0.1));
            System.out.print("Você teve 10% de desconto, você irá pagar: " + desc);
        } else if (valor == 150.00) {
            desc = (float) (valor - (valor * 0.07));
            System.out.print("Você teve 7% de desconto, você irá pagar: " + desc);
        }else {
            desc = (float) (valor - (valor * 0.04));
            System.out.print("Você teve 4% de desconto, você irá pagar: " + desc);
        }

    }

    public static void main(String[] args) {
        desconto();
    }

}
