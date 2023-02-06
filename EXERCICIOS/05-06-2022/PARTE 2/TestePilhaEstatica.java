public class TestePilhaEstatica {
    public static void main(String[] args) {
        Pilhas p2 = new Pilhas();
        Pilhas p = new Pilhas();

        int i;
        System.out.println(p2);
        i = 10;
        while (i < 220) {
            p2.push(i);
            i *= 2;
        }
        System.out.println(p2);
        System.out.println(p);
        i = 10;
        while (i < 500) {
            p.push(i);
            i *= 2;
        }
        System.out.println(p);

        // System.out.println(p2.invertePosicao(p2));
        // System.out.println(p2.pilha1eMaiorqueAP2(p, p));
        System.out.println(p.saoIguais(p, p));

    }
}
