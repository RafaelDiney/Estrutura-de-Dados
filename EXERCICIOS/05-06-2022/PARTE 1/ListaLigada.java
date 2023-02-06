public class ListaLigada {
    private No primeiro;

    public ListaLigada() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;

    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    @Override
    public String toString() {
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

    public void insereFim(int i) { // Remove
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

    public int removeInicio() { // Remove

        int i = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return i;
    }

    public int removeFim() { // Remover
        int i;
        // Verificar se tem um elemento só
        if (primeiro.getProximo() == null) {
            i = primeiro.getInfo();
            primeiro = null;
        } else {
            // Percorrer a lista até o penúltimo
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
    }

    // Verifica se um valor pertence à lista (devolve true ou false)
    public boolean searchBelonging(int x) {
        int i;
        // Percorrer a lista até o último
        No aux = primeiro;
        while (aux.getProximo() != null) {
            if (aux.getInfo() == x) {
                return true;
            }
            aux = aux.getProximo();
        }
        if (aux.getProximo() == null) {
            if (aux.getInfo() == x) {
                return true;
            }
        }
        return false;
    }

    // Verifica quantas vezes um valor aparece na lista (devolve a quantidade)
    public int occurrenceNumber(int x) {
        int cont = 0;
        // Percorrer a lista até o último
        No aux = primeiro;
        while (true) {
            if (aux.getInfo() == x) {
                cont++;
            }
            if (aux.getProximo() == null) {
                break;
            }
            aux = aux.getProximo();
        }

        return cont;
    }

    // Devolve o valor que está na primeira posição (sem remover)
    public int firstPosition() {
        return primeiro.getInfo();
    }

    // Devolve o valor que está na última posição (sem remover)
    public int LastPosition() { // Remover
        int i;
        // Verificar se tem um elemento só
        if (primeiro.getProximo() == null) {
            i = primeiro.getInfo();
        } else {
            // Percorrer a lista até o último
            No aux = primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            i = aux.getInfo();
        }
        return i;
    }

    // Devolve a posição da primeira ocorrência de um elemento na lista (devolve -1,
    // se ele não existir)
    public int firstOccurrence(int x) {
        int cont = 0;
        // Percorrer a lista até o último
        No aux = primeiro;
        while (true) {

            if (aux.getInfo() == x) {
                return cont;
            }
            cont++;

            if (aux.getProximo() == null) {
                return -1;
            }
            aux = aux.getProximo();
        }

    }

    
    public ListaLigada separateList() { // Separa uma lista dada em 2, uma de pares e outra de ímpares
        int i;
        ListaLigada Pares = new ListaLigada();
        ListaLigada Impares = new ListaLigada();

        // Percorrer a lista até o último
        No aux = primeiro;
        do {
            if (aux.getInfo() % 2 == 0) {
                No novo = new No(aux.getInfo());
                if (Pares.estaVazia())
                    Pares.primeiro = novo;
                else {
                    No aux2 = Pares.primeiro;
                    while (aux2.getProximo() != null)
                        aux2 = aux2.getProximo();
                    aux2.setProximo(novo);
                }

            } else {
                No novo = new No(aux.getInfo());
                if (Impares.estaVazia())
                    Impares.primeiro = novo;
                else {
                    No aux2 = Impares.primeiro;
                    while (aux2.getProximo() != null)
                        aux2 = aux2.getProximo();
                    aux2.setProximo(novo);
                }

            }
            if (aux.getProximo() == null)
                break;
            aux = aux.getProximo();
        } while (true);

        System.out.println("Pares: " + Pares);
        System.out.println("Impares: " + Impares);
        return Pares;
    }

    public ListaLigada merge(ListaLigada x, ListaLigada z) { //Realiza o Merge de duas listas
        ListaLigada nova = new ListaLigada();

        No aux = x.primeiro;
        while (true) {

            No novo = new No(aux.getInfo());
            if (nova.estaVazia())
                nova.primeiro = novo;
            else {
                No aux2 = nova.primeiro;
                while (aux2.getProximo() != null)
                    aux2 = aux2.getProximo();
                aux2.setProximo(novo);
            }
            if(aux.getProximo()==null){
                break;
            }
            aux = aux.getProximo();
        }

        aux = z.primeiro;
        while (true) {

            No novo = new No(aux.getInfo());
            if (nova.estaVazia())
                nova.primeiro = novo;
            else {
                No aux2 = nova.primeiro;
                while (aux2.getProximo() != null) {
                    aux2 = aux2.getProximo();
                }
                aux2.setProximo(novo);
            }
            if(aux.getProximo()==null){
                break;
            }
            aux = aux.getProximo();
        }

        return nova;
    }
}
