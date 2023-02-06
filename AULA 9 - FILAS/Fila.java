public class Fila {
    private No primeiro;
    private No ultimo;
    private int length;

    // por clareza, escrever o padrão
    public Fila() {
        primeiro = null;
        ultimo = null;
        length = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public String toString() {
        String lista = "Fila: ";
        if (estaVazia()) {
            lista += "esta vazia";
        } else {
            No aux = primeiro;
            int pos = 1;
            while (aux != null) {
                lista += "\n" + pos++ + ": " + aux;
                aux = aux.getProximo();
            }
        }
        return lista;
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public void enfileirar(Pessoa p) {
        No novo = new No(p);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        length++;
    }

    public Pessoa desenfileira() {
        Pessoa p = primeiro.getInfo();
        if (primeiro == ultimo)
            ultimo = null;
        primeiro = primeiro.getProximo();
        length--;
        return p;
    }

}