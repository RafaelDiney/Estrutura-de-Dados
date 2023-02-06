public class Pilhas {
    private No topo;

    public Pilhas() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return this.topo == null;
    }

    public void push(int i) {
        No novo = new No(i);
        if (!estaVazia())
            novo.setProximo(this.topo);
        this.topo = novo;
    }

    public int pop() {
        int i = this.topo.getInfo();
        this.topo = this.topo.getProximo();
        return i;
    }

    public int peek() {
        return this.topo.getInfo();
    }

    public int search(int x) {
        No aux = this.topo;
        int pos = 0;
        while (aux != null) {
            if (aux.getInfo() == x) {
                return pos;
            }
            aux = aux.getProximo();
            pos++;
        }
        return -1;
    }

    @Override
    public String toString() {
        String s = "pilha: ";
        if (this.estaVazia())
            s = s + "esta vazia";
        else {
            No aux = this.topo;
            while (aux != null) {
                s = s + aux.getInfo() + " ";
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }

    public Pilhas invertePosicao(Pilhas p) { // Inverte a posição dos elementos
        Pilhas pi = new Pilhas();
        Pilhas aux2 = new Pilhas();
        No aux = p.topo;
        while (true) { // Primeiro laço joga os elementos na pi invertidos

            pi.push(aux.getInfo());
            p.pop();

            if (aux.getProximo() == null)
                break;

            aux = aux.getProximo();
        }
        aux = pi.topo;
        while (true) { // Segundo laço joga os elementos da pi na aux2 na ordem que eles chegaram

            aux2.push(aux.getInfo());
            pi.pop();

            if (aux.getProximo() == null)
                break;

            aux = aux.getProximo();
        }
        aux = aux2.topo;
        while (true) { // terceiro laço joga os elementos na original invertidos

            p.push(aux.getInfo());
            aux2.pop();

            if (aux.getProximo() == null)
                break;

            aux = aux.getProximo();
        }
        return p; // Devolve a original com os elementos invertidos

    }

    public boolean pilha1eMaiorqueAP2(Pilhas p, Pilhas p2) { //Testar se a pilha1 tem mais elementos que a pilha 2
        No aux = p.topo;
        int cont = 0, cont2 = 0;

        while (true) {
            cont++;
            if (aux.getProximo() == null)
                break;

            aux = aux.getProximo();
        }
        System.out.println(cont);
        No aux2 = p2.topo;
        while (true) {
            cont2++;
            if (aux2.getProximo() == null)
                break;

            aux2 = aux2.getProximo();
        }
        System.out.println(cont2);
        if (cont > cont2) // Se a pilha um for maior devolve verdadeiro
            return true;
        else // Se não a devolve falso
            return false;

    }

    public boolean saoIguais(Pilhas p, Pilhas p2) { //Verifica se as duas pilhas são iguais
        No aux = p.topo;
        No aux2 = p2.topo;

        while (true) {
            System.out.println(aux.getInfo());
            System.out.println(aux2.getInfo());
            if (aux.getInfo() == aux2.getInfo()) { //Se os elementos das pilhas forem iguais 

                if (aux.getProximo() == null && aux2.getProximo() == null) { //E chegarem até o ultimo elemento
                    return true; // Retorna verdadeiro pois são iguais
                }
            }
            else{ //Se em algum momento falhar a primeira condição já sabemos que as pilhas não são iguais
                return false; //Então retorna falso
            }
            aux = aux.getProximo();
            aux2 = aux2.getProximo();
        }
        

    }
}