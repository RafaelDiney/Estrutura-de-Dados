import java.util.Scanner; //classe utilitária



public class TesteEntradaScanner {

    public static void main(String[] args) {

        int i;

        Scanner scanner = new Scanner(System.in); //para lembrar: new "=" malloc

        System.out.println("digite um inteiro:");

        i = scanner.nextInt();

        System.out.println("digite um decimal:");

        double d = scanner.nextDouble();

        System.out.println("digite true ou false");

        boolean b = scanner.nextBoolean();



        System.out.println("digite uma string");

        String s1 = scanner.next();

        System.out.println("digite outra string");

        String s2 = scanner.nextLine();

        System.out.println("se conseguir, digite mais uma");

        String s3 = scanner.nextLine();

        System.out.println("s1 = [" + s1 + "]\ns2 = [" + s2 + "]\ns3 = [" + s3 + "]");



        System.out.println("digite uma letra");

        char caracter = scanner.nextLine().charAt(0);

        System.out.println("voce digitou " + caracter);

        scanner.close(); //para lembrar: free

    }

}