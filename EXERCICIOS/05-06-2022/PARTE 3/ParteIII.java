public class ParteIII {

    static void exibe0aNDecrescenteRec(int n) { // Imprime de 0 a N Decrescente
        System.out.println(n);
        if (0 < n) {
            exibe0aNDecrescenteRec(n - 1);
        }
    }

    static void exibePares0aNCrescenteRec(int n) { // Imprime pares de 0 a N crescente
        if (n % 2 == 0)
            System.out.println(n);
        if (0 < n) {
            exibePares0aNCrescenteRec(n - 1);
        }
    }

    static void exibePares0aNDecrescenteRec(int n) { // Imprime pares de 0 a N Decrescente
        if (n % 2 == 0)
            System.out.println(n);
        exibePares0aNCrescenteRec(n - 1);
    }

    static void exibeElementosArray(int[] n, int i) { // Imprime os elementos de um array
        if (i < n.length) {
            System.out.print(n[i]+" ");
            exibeElementosArray(n, i + 1);
        }

    }

    static int exibeMenorElemento(int[] n, int i, int t) { // Retorna o menor elemento
        if (i == t) {
            return n[i];
        } else {
            int e1, e2;
            int m;

            m = (i + t) / 2;
            e1 = exibeMenorElemento(n, i, m);
            e2 = exibeMenorElemento(n, m + 1, t);

            if (e1 < e2)
                return e1;
            else
                return e2;
        }

    }

    public static void main(String[] args) {
        System.out.println();
        int[] array = { 10, 2, 3, 4, 5 };

        //exibe0aNDecrescenteRec(20);
        //exibePares0aNCrescenteRec(20);
        //exibePares0aNDecrescenteRec(20);
        exibeElementosArray(array, 0);
        //System.out.println(exibeMenorElemento(array, 0, array.length - 1));

    }
}