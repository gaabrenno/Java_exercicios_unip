package lpoo.aula1;

import java.text.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

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


    public class Pluralizador {

        private static final Map<String, String> EXCECOES = new HashMap<>();

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

        static {
            EXCECOES.put("pão", "pães");
            EXCECOES.put("mão", "mãos");
            EXCECOES.put("cão", "cães");
            // Adicione aqui outras exceções conforme necessário
        }
    }

    public static void soma9999() {
        float num = 0, soma = 0, media = 0;
        int contador = 0;
        String input = "";

        while (!input.equals("9999")) {
            input = JOptionPane.showInputDialog("Insira o número a ser somado (digite 9999 para parar):");
            if (!input.equals("9999")) {
                num = Float.parseFloat(input);
                soma += num;
                contador++;
            }
        }

        if (contador > 0) {
            media = soma / contador;
            System.out.print("A média é: " + media);
        } else {
            System.out.print("Nenhum número foi digitado.");
        }
    }

    public static void semestre(){
        float np1, np2, inst, exame, media, soma;

        String lenp1 = JOptionPane.showInputDialog("Insira o valor da NP1:");
        np1=Float.parseFloat(lenp1);
        String leinst = JOptionPane.showInputDialog("Insira o valor da Institucional:");
        inst=Float.parseFloat(lenp1);
        String lenp2 = JOptionPane.showInputDialog("Insira o valor da NP2:");
        np2=Float.parseFloat(lenp1);
        soma=(np1*3)+(np2*3)+(inst*4);
        media=soma/10;

        if (media>=7){
           JOptionPane.showMessageDialog(null,"Parabéns você foi aprovado!!!");
        }else {
            JOptionPane.showMessageDialog(null,"Você ficou de exame!");
            String leexame = JOptionPane.showInputDialog("Insira o valor do Exame:");
            exame = Float.parseFloat(leexame);
            media=(media+exame)/2;

            JOptionPane.showMessageDialog(null,"Sua média final é: "+media);
            if (media<5){
                JOptionPane.showMessageDialog(null, "Você está reprovado!");
            }else {
                JOptionPane.showMessageDialog(null, "Você esta aprovado!");
            }
        }



    }

    public static void aumento(){
        String nome,cpf, lesalario;
        float salario, aument, nsalario = 0;
        Integer contator = 0, tempo = 6;

        nome=JOptionPane.showInputDialog("Insira seu nome:");
        cpf=JOptionPane.showInputDialog("Insira seu CPF:");
        lesalario=JOptionPane.showInputDialog("Insira o valor do seu salario atual:");
        salario=Float.parseFloat(lesalario);
        aument= (float)(salario*0.07);

        while (contator <=tempo){

            if (contator==0){
                JOptionPane.showMessageDialog(null, "Neste mês seu salario ainda é o normal! Ou seja R$"+salario+"!");
            } else {
                salario=salario+aument;
                JOptionPane.showMessageDialog(null, nome+", este é o "+contator+"º mês de almento de 6! Você receberá: R$" + salario+".");
                aument= (float)(salario*0.07);
            }
            //salario = salario+aument;
            contator=contator+1;

        }

    }

    public static void main(String[] args) {
        aumento();
    }


}