import java.util.Scanner;

public class Fibonacci {
    static void fibVetor(int[] v) {
        v[0] = 1;
        v[1] = 1;
        for (int i = 2; i < v.length; i++) {
            v[i] = v[i - 1] + v[i - 2];

        }
    }

    static int fibRec(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibRec(n - 1) + fibRec(n - 2);

    }

    public static void main(String[] args) {
        int[] v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da sequencia? ");
        int t = scanner.nextInt();
        v = new int[t];
        fibVetor(v);
        System.out.println("sequencia gerada por laco e vetor");
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.println("\nSequencia gerada pela recurssao:");
        for (int i = 1; i <= t; i++) {
            System.out.print(fibRec(i) + " ");
        }

        scanner.close();

    }
}
