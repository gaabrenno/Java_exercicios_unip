package lpoo.aula1;

import javax.swing.*;

public class Aula4 {

    public static void somaSub(){
        int impr, soma = 0, nun;

        for (nun=1256; nun <= 1278;nun++) {
            nun = nun + nun;
            soma = nun;
        }
        JOptionPane.showMessageDialog(null, "O resultado final é: "+soma);
    }


    public static void main(String[]args){
        somaSub();
    }
}
