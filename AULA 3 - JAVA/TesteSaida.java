import javax.swing.JOptionPane;

public class TesteSaida {
    public static void main(String args[]) {

        int a = 10, b = 20;
        System.out.print("Mensagem, depois continua na mesma linha");
        System.out.println("Ficou tudo grudade, depois foi pra linha de baixo");
        System.out.printf("%d\n", a);
        System.out.println("a =" + a);
        System.out.println("a + b =" + a + b);
        System.out.println("a + b = " + (a + b) + " agora com ()");

        JOptionPane.showMessageDialog(null, "abrindo a janelinha");
        JOptionPane.showMessageDialog(null, "a = " + a);

        JOptionPane.showMessageDialog(null, "Janela enfeitada", "Este é o título", JOptionPane.WARNING_MESSAGE);
    }
    
}
