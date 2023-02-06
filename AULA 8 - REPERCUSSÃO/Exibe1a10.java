public class Exibe1a10 {

    static void exibe1a10Rec(int n){
        System.out.println(n + " ");
        if (n<10){
            exibe1a10Rec(n+1);
        }
        System.out.println("estou no nivel " + n);
    }
    public static void main(String[]args) {
        for(int i=1; i<=10; i++){
            System.out.println(i + " ");
        }
        System.out.println();
        exibe1a10Rec(1);
    }
}