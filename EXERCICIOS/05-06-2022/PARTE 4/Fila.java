import java.util.Calendar;

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

    public Fila[] filaPreferencial(Fila f){
        Fila preferencial = new Fila();
        Pessoa aux = primeiro.getInfo();
        No aux2 = primeiro;
        while (aux != null) {
            if(((Calendar.DAY_OF_YEAR)-aux.getAnoNacimento()) > 60){ //Se tiver mais que 60 anos 
                preferencial.enfileirar(aux); //Enfileira na preferencial 
                f.desenfileira(); // Desenfilera da fila original
            }
            aux2 = aux2.getProximo() ;
        }
        return new Fila[]{f,preferencial};
    }

    public Fila filaPremptiva(Fila f){
        Fila premptiva = new Fila();
        Pessoa aux = primeiro.getInfo();
        No aux2 = primeiro;
        while (aux != null) {
            if(((Calendar.DAY_OF_YEAR)-aux.getAnoNacimento()) > 60){ //Se tiver mais que 60 anos 
                premptiva.enfileirar(aux); //Enfileira na preferencial 
                f.desenfileira(); // Desenfilera da fila original
            }
            aux2 = aux2.getProximo() ;
        }
        aux = f.primeiro.getInfo(); //Esse laço enfileira todos os que sobraram na fila original
        while (aux != null) {
                premptiva.enfileirar(aux); //Enfileira na premptiva 
                f.desenfileira(); // Desenfilera da fila original
            aux2 = aux2.getProximo();
        }
        return premptiva; //devolve a fila com os idosos na frente
    }
}