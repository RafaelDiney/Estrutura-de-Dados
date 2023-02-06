import java.util.Scanner;

public class Teste_ListaLigada {
    public static void main(String[] args) {

        ListaLigada Lista = new ListaLigada();
        ListaLigada Lista2 = new ListaLigada();
        Scanner scanner = new Scanner(System.in);
        int tamanho=10, i=0, valor=51, z;

        while(i<tamanho){

            Lista.insereFim(valor);
            valor ++;
            i++;
        }
        System.out.println(Lista);

        while(i<tamanho){

            Lista2.insereFim(valor);
            valor ++;
            i++;
        }
        System.out.println(Lista2);

        System.out.println("Digite um numero para buscar: ");
        z = scanner.nextInt();

        System.out.println(Lista.searchBelonging(z));
        System.out.println("Apareceu "+Lista.occurrenceNumber(z)+"vezes");
        System.out.println(Lista.firstPosition());
        System.out.println(Lista.LastPosition());
        System.out.println(Lista.firstOccurrence(z));
        System.out.println(Lista);
        Lista.separateList();
        System.out.println(Lista);
        System.out.println(Lista.merge(Lista, Lista));
    }
}
