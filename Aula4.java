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

    public static void quadrado(){
        int nun, quadrado;

        for (nun = 1; nun<=10; nun++){
            quadrado = nun*nun;
            JOptionPane.showMessageDialog(null,"O quadrado de "+nun+" é:"+quadrado);
        }
    }

    public static void main(String[]args){

        quadrado();
    }
}
