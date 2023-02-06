public class Recursivo {

    // Receber um número inteiro positivo N e imprimir todos os números naturais de
    // 0 a N
    // em ordem decrescente.
    static void imprimiDecrescente(int x) { //Imprime de 0 a N decrescente
        if (x == -1)
            return;
        System.out.println(x);
        imprimiDecrescente(x - 1);
    }

    private int imprimiCrescentePares(int n) {
        if(n % 2 == 0)
        System.out.println(n);

        if(n == -1)
          return 0;
    
        return imprimirParesDecrescente(n - 1);
    }

    private int imprimirParesDecrescente(int n) { //Imprime pares de 0 a N (decrescente)
        if(n == -1)
          return 0;
    
        if(n % 2 == 0)
        System.out.println(n);
        return imprimirParesDecrescente(n - 1);
      }

    public static void main(String[] args) {
        Recursivo decrescente = new Recursivo();
        decrescente.imprimiCrescentePares(20);
    }
}
