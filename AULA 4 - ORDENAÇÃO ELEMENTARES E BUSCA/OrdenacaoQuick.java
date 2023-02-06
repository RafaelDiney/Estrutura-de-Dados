import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class OrdenacaoQuick {

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

    static void bubbleSort(int v[], int n) { //Compara e organiza
        int i, j, aux;
        for (i = 1; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) { // Principal está recebendo as entradas e chamando os métodos

        // Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor(0 - encerra o programa): ");
        int n = scanner.nextInt();
        while (n > 0) {

            // Alocação do vetor
            int[] v = new int[n];

            // Processamento
            geraVetor(v, n);
            // Saída
            //
            exibeVetor(v, n, "\nVetor Original\n");
            //Processamento
            //Marcando o inicio
            Date dataIni = new Date();
            long iniBubble = dataIni.getTime(); //Marca a hora atual
            bubbleSort(v, n);
            //Marcando o tempo final
            long fimBubble = new Date().getTime(); //Marca a hora atual no caso fazemos uma substração para sabermos quanto tempo demorou colocando nos lugares certo
            
            //Saída
            exibeVetor(v, n, "\n\nVetor Ordenado\n");
            System.out.println("\n\nTempo de ordenacao: " + (fimBubble - iniBubble) + "ms");
            // Verificar a continuidade do laço
            System.out.print("Digite o tamanho do vetor(0 - encerra o programa): ");
            n = scanner.nextInt();
        }

        scanner.close();
    }
}

