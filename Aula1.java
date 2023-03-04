package lpoo.aula1;
import java.text.*;
import javax.swing.JOptionPane;


public class Aula1 {
    public static void dados(){
        String nome, endereco, data, cit;
        String lenome = JOptionPane.showInputDialog("Digite seu nome:");
        nome = lenome;

        String ledata = JOptionPane.showInputDialog ("Informe sua data de nascimento:");
        data = ledata;

        String leendereco = JOptionPane.showInputDialog("Informe seu endereço:");
        endereco = leendereco;

        String lecit = JOptionPane.showInputDialog("informe sua cidade");
        cit = lecit;

        JOptionPane.showMessageDialog(null, "Olá "+ nome +"! Você nasceu no dia: "+ data +",e atualmente reside em "+ endereco +", na cidade de "+ cit +"!");
    }
    public static void idade(){
        int idJoao, idPedro, idLucas, idRodolfo, idMariana;

        String leidJoao = JOptionPane.showInputDialog("Informe a idade de João:");
        String leidPedro = JOptionPane.showInputDialog("Informe a idade de Pedro:");
        String leidLucas = JOptionPane.showInputDialog("Informe a idade de Lucas:");
        String leidRodolfo = JOptionPane.showInputDialog("Informe a idade de Rodolfo:");
        String leidMariana = JOptionPane.showInputDialog("Informe a idade de Mariana:");
        idJoao = Integer.parseInt (leidJoao);
        idPedro = Integer.parseInt (leidPedro);
        idLucas = Integer.parseInt (leidLucas);
        idRodolfo = Integer.parseInt (leidRodolfo);
        idMariana = Integer.parseInt (leidMariana);
        JOptionPane.showMessageDialog(null, "A idade de João é "+ idJoao +", a idade de Pedro é "+ idPedro +",a idade de Lucas é  "+ idLucas +", a idade de Rodolfo é "+ idRodolfo +" e a idade de Mariana é "+ idMariana);
    }
    public static void dolarReal (){
        float real, dolar, conversao;

        String leDolar = JOptionPane.showInputDialog("Informe o valor atual do Dolar:");
        String leReal = JOptionPane.showInputDialog("Informe o valor de Reais que serão convertidos para Dolar:");
        conversao = Float.parseFloat(leDolar)*Float.parseFloat(leReal);
        real = Float.parseFloat(leReal);
        dolar = Float.parseFloat(leDolar);
        JOptionPane.showMessageDialog(null,"R$"+real+" está valendo: $"+conversao+"!");
    }
    public static void main(String[] args) {
        dados();

    }
}
