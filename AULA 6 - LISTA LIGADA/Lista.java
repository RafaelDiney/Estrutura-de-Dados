public class Lista {
    private No primeiro;

    // por clareza, escrever o padrão
    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;

    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    @Override
    public String toString() { // Percorre a lista
        String lista = "lista: ";
        if (estaVazia()) {
            lista += "esta vazia";
        } else {
            No aux = primeiro;
            while (aux != null) {
                lista += aux + " ";
                aux = aux.getProximo();
            }
        }
        return lista;
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public void insereInicio(int i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public void insereFim(int i) {
        No novo = new No(i);
        if (estaVazia())
            primeiro = novo;
        else {
            No aux = primeiro;
            while (aux.getProximo() != null)
                aux = aux.getProximo();
            aux.setProximo(novo);
        }
    }

    public int removeInicio() {

        int i = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return i;
    }

    public int removeFim() {
        int i;
        //Verificar se tem um elemento só
        if(primeiro.getProximo() == null){
            i = primeiro.getInfo();
            primeiro = null;
        }
        else{
            //Percorrer a lista até o penúltimo
            No aux = primeiro;
            while(aux.getProximo().getProximo() != null){
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
       return i;
    }
}
