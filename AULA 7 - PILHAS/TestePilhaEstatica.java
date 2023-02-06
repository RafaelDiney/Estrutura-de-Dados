public class TestePilhaEstatica {
    public static void main(String[] args) {
        PilhaEstatica p = new PilhaEstatica();
        PilhaDinamica p2 = new PilhaDinamica();

        System.out.println(p);
        int i = 10;
        while(!p.estaCheia()){
            p.push(i);
            i*=2;
            System.out.println(p);
        }
        while(!p.estaVazia()){
            System.out.println(p.pop() + " foi desempilhado");
            System.out.println(p);
        }   

        System.out.println(p2);
        i = 10;
        while(i<120){
            p2.push(i);
            i*=2;
            System.out.println(p);
        }
        while(!p2.estaVazia()){
            System.out.println(p2.pop() + " foi desempilhado");
            System.out.println(p2);
        }   
    }
}
