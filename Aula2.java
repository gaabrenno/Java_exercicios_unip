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
        } else {
            desc = (float) (valor - (valor * 0.04));
            System.out.print("Você teve 4% de desconto, você irá pagar: " + desc);
        }

    }

    public static void multa() {
        int multas;

        String lemultas = JOptionPane.showInputDialog("Insira a quantidade de multas em um ano:");
        multas = Integer.parseInt(lemultas);

        if (multas > 5) {
            System.out.print("Você até pode ser uma boa pessoa, mas não um bom motorista!");
        } else if (multas == 5) {
            System.out.print("Você dirige bem, mas precisa prestar mais atenção!");
        } else {
            System.out.print("Parabéns! Você é um bom motorista!");
        }

    }

    public static void festa() {
        int noite;

        String lenoite = JOptionPane.showInputDialog("Insira a quantidade de amigos que você encontrou na festa:");
        noite = Integer.parseInt(lenoite);

        if (noite > 5) {
            System.out.print("Você é popular!");
        } else if (noite == 5) {
            System.out.print("Você é uma pessoa normal!");
        } else {
            System.out.print("Você precisa socializar mais!");
        }

    }

    public static void media() {
        float n1, n2, n3, n4, soma, media;
        String aluno;

        aluno = JOptionPane.showInputDialog("insira o nome do aluno");
        String len1 = JOptionPane.showInputDialog("Insira a primeira nota do aluno:");
        n1 = Integer.parseInt(len1);
        String len2 = JOptionPane.showInputDialog("Insira a primeira nota do aluno:");
        n2 = Integer.parseInt(len2);
        String len3 = JOptionPane.showInputDialog("Insira a primeira nota do aluno:");
        n3 = Integer.parseInt(len3);
        String len4 = JOptionPane.showInputDialog("Insira a primeira nota do aluno:");
        n4 = Integer.parseInt(len4);

        soma = n1 + n2 + n3 + n4;
        media = soma / 4;

        System.out.print("A média do aluno " + aluno + " é: " + media);

    }

    public static void prova() {
        String turma;

        turma = JOptionPane.showInputDialog("Insira sua turma:");

        switch (turma){
            case "Computação":
                System.out.print("Sua prova será dia 05/05/2023, às 19h10, na sala 212D do bloco D2");
                break;
            case "computação":
                System.out.print("Sua prova será dia 05/05/2023, às 19h10, na sala 212D do bloco D2");
                break;
            case "computacao":
                System.out.print("Sua prova será dia 05/05/2023, às 19h10, na sala 212D do bloco D2");
                break;
            case "Computacao":
                System.out.print("Sua prova será dia 05/05/2023, às 19h10, na sala 212D do bloco D2");
                break;
            default:
                System.out.print("Sua prova ainda não está marcada");
        }
    }

    public static void iptu() {
        int numcasa;

        String lenumcasa = JOptionPane.showInputDialog("Insira o número da sua casa:");
        numcasa = Integer.parseInt(lenumcasa);

        if (numcasa > 65) {
            System.out.print("Seu IPTU será parcelado em até 3x!");
        } else if (numcasa == 65) {
            System.out.print("Seu IPTU será parcelado em até 2x!");
        } else {
            System.out.print("Seu IPTU deverá ser pago a vista!");
        }

    }

    public static void main(String[] args) {
        iptu();
    }

}
