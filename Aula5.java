package lpoo.aula1;

import javax.swing.*;

public class Aula5 {

    public static void cursos() {
        String cursos[] = {"Ciencias da Computação", "Engenharia Civil", "Educação Fisica", "Pisicologia"};

        for (String i : cursos) {
            System.out.println(i);
        }
    }

    public static void caos() {
        String nome[] = new String[10];
        String cpf[] = new String[10];
        float n1[] = new float[10];
        float n2[] = new float[10];
        int contador;

        for (contador = 0; contador < 10; contador++) {
            String leNome = JOptionPane.showInputDialog("Insira o nome dos alunos:");
            nome[contador] = leNome;

            String leCpf = JOptionPane.showInputDialog("Insira o CPF dos alunos:");
            cpf[contador] = leCpf;

            String leN1 = JOptionPane.showInputDialog("Insira a N1 dos alunos:");
            n1[contador] =Float.parseFloat(leN1);

            String leN = JOptionPane.showInputDialog("Insira a N2 dos alunos:");
            n2[contador] =Float.parseFloat(leN1);

        }
        JOptionPane.showMessageDialog(null,"O nome do 4º aluno é: "+nome[4]+". Já o CPF do 7º aluno é: "+cpf[7]+". E a média da N1 e N2 do 2º aluno é: "+(n1[2]+n2[2]/2));

    }

    public static void main(String[] args) {
        caos();
    }
}
