import javax.swing.JOptionPane;

public class TesteEntrada {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");

        JOptionPane.showMessageDialog(null, "nome completo: " + nome + " " + sobrenome);

        String strInteiro = JOptionPane.showInputDialog("digite um inteiro");
        int intInteiro = Integer.parseInt(strInteiro);

        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um decimal"));

        boolean b = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true ou false"));

        JOptionPane.showMessageDialog(null, "O inteiro: " + intInteiro + "\nO decimal: " + d + "\no Boolean: " + b);

        char c = nome.charAt(0);

        JOptionPane.showMessageDialog(null, "primeira letra do nome: " + c);

        char letra = JOptionPane.showInputDialog("Digite uma letra").charAt(0);

        JOptionPane.showMessageDialog(null, "voce digitou" + letra, "resultado", JOptionPane.WARNING_MESSAGE);
    }

}
