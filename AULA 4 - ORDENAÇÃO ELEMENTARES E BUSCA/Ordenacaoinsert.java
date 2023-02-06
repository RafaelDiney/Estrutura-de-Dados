import java.util.Random;
import java.util.Scanner;

public class Ordenacaoinsert {

    static void geraVetor(int[] v, int n) { // Geração randomica do vetor

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            v[i] = random.nextInt(n * 10);

        }

    }

    static void exibeVetor(int[] v, int n, String msg) { // Exibição do Vetor

        System.out.printf(msg);
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }

    }

    static void insertionSort(int v[], int n) { // Compara e organiza
        int i, j, aux;

        for (j = 1; j < n; ++j) {
            aux = v[j];

            for (i = j - 1; i >= 0 && v[i] < aux; --i)
                v[i + 1] = v[i];
            v[i + 1] = aux;

        }
    }

    public static void main(String[] args) { // Principal está recebendo as entradas e chamando os métodos

        // Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor(0 - encerra o programa): ");
        int n = scanner.nextInt();
        while (n > 0) {

            int[] v = new int[n];

            geraVetor(v, n);
            exibeVetor(v, n, "\nVetor Original\n");

            insertionSort(v, n);
            exibeVetor(v, n, "\n\nVetor Ordenado\n");

            System.out.print("\nDigite o tamanho do vetor(0 - encerra o programa): ");
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
