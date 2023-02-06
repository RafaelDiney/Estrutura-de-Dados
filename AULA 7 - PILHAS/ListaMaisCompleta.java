public class ListaMaisCompleta {
    private No primeiro;
    private No ultimo;
    private int length;

    //por clareza, escrever o padrão
    public ListaMaisCompleta () {
        primeiro = null;
        ultimo = null;
        length = 0;
    }
    public No getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro (No primeiro) {
        this.primeiro = primeiro;
    }
    public No getUltimo() {
        return this.ultimo;
    }
    public void setUltimo (No ultimo) {
        this.ultimo = ultimo;
    }
    public int getLength () {
        return this.length;
    }

    @Override
    public String toString() {
        String lista = "lista: ";
        if (estaVazia()) {
            lista += "esta vazia";
        }
        else {
            No aux = primeiro;
            while (aux != null) {
                lista += aux + "->";
                aux = aux.getProximo();
            }
            lista+="//";
        }
        return lista;
    }
    public boolean estaVazia() {
        return (primeiro == null);
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
        }
        length++;
        primeiro = novo;
    }
    public void insereFim(int i) {
        No novo = new No(i);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        length++;
    } 
    public int removeInicio() {
        int i = primeiro.getInfo();
        if (primeiro == ultimo) 
            ultimo = null;
        primeiro = primeiro.getProximo();
        length--;
        return i;
    }
    public int removeFim()  {
        int i;
        //TODO - divertimentos para o lar
        return i;
}
