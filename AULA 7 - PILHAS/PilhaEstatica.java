public class PilhaEstatica {
    int[] dados; // Vetor de inteiros
    int topo;

    // Construtor da pilha por padrão
    public PilhaEstatica() {
        dados = new int[10];
        topo = 0; // Não precisa colocar por padrão o JVS ja atribui a 0.
    }

    // Construtor caso o usuario escolha
    public PilhaEstatica(int capacidade) {
        dados = new int[capacidade];
        topo = 0;
    }

    public boolean estaVazia() {

        return this.topo == 0; // Se o topo estiver 0 ela está vazia e o método retornou verdadeiro
    }

    public boolean estaCheia() {
        return this.topo == dados.length; // Topo for igual capacidade quer dizer que a pilha está cheia
        // No caso usou dados.length para trazer a capacidade, ja que a mesma não é um
        // atributo
    }

    public void push(int i) { // Inserir na pilha
        this.dados[this.topo++] = i;
        // this.topo++;
    }

    public int pop() { // Remover da pilha
        // this.topo--;
        return this.dados[--this.topo];
    }

    @Override
    public String toString() {
        String s = "pilha: ";
        if (estaVazia())
            s = s + "esta vazia";
        else {
            for (int i = topo - 1; i >= 0; i--)
                s = s + dados[i] + " ";
        }
        s = s + "\n";
        return s;
    }
    
    // Consulta topo
    public int peek(){
        return this.dados[this.topo -1];
    }

    //Busca por um elemento
    public int search(int x){
        for (int i=topo-1;i>=0;i--)
            if (dados[i] == x)
                return i;
        return -1;
    }
}