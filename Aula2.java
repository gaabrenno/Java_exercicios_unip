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

    public static void turma(){
        int quanTurma;

        String lequanTurma = JOptionPane.showInputDialog("Insira a quantidade de alunos na nurma:");
        quanTurma = Integer.parseInt(lequanTurma);

        if (quanTurma > 30){
            System.out.print("Parabêns! Sua turma tem "+quanTurma+" alunos. Vocês irão para Cancun!");
        } else if (quanTurma == 30){
            System.out.print("Parabêns! Sua turma tem "+quanTurma+" alunos. Vocês irão para Fortaleza!");
        }
        else {
            System.out.print("Parabêns! Sua turma tem "+quanTurma+" alunos. Vocês irão para Caldas Novas!");
            }
    }

    public static void main(String[] args) {
        turma();
    }

}
