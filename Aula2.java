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
            System.out.print("Você não terá desconto!");
        }
    }

    public static void main(String[] args) {
        quantIrmaos();
    }
}
