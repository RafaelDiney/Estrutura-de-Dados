import java.util.Random;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) { // psvm

        System.out.println("Qual o tamanho do vetor?"); // sysout; Pedindo para entrar com o tamanho do vetor
        Scanner scanner = new Scanner(System.in); // Scanner não é estatico por isso tem que instanciar
        int n = scanner.nextInt();

        double[] v1 = new double[n]; // declara e instacia o vetor, o V é uma variavel de referencia e recebe new
                                     // int[10] alocado dinamicamente

        System.out.println("Vetor de doubles:");
        for (int i = 0; i < n; i++) {

            v1[i] = Math.random(); // Chamando o método Randon dentro da classe Math, que devolve valores
                                   // aleatórios de 0 até 1
            System.out.print(v1[i] + " ");

        }

        int[] v2 = new int[n];
        System.out.println("\nVetor de int:");
        for (int i = 0; i < n; i++) {

            v2[i] = (int) (100 * Math.random()); // Multiplica por 100 e dps pelo int para gerar os números inteiros,
                                                 // sem os numeros decimais, vulgo casting
            System.out.print(v2[i] + " ");

        }

        int[] v3 = new int[n];
        System.out.println("\n\nVetor de int's com a classe Random sem limite:");
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            v3[i] = random.nextInt();
            System.out.print(v3[i] + " ");
        }

        int[] v4 = new int[n];
        System.out.println("\n\nVetor de int's com a classe Random com limite:");

        for (int i = 0; i < n; i++) {
            v4[i] = random.nextInt(100); // O numero dentro do parenteses é o limite do numeros gerados
            System.out.print(v4[i] + " ");
        }
        scanner.close();
    }
}