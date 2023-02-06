public class PilhaDinamica {
    private No topo;
    
    public PilhaDinamica(){
        this.topo = null;
    }

    public boolean estaVazia(){
        return this.topo == null;
    }

    public void push (int i){
        No novo = new No(i);
        if(!estaVazia())
            novo.setProximo(this.topo);
        this.topo = novo;    
    }

    public int pop(){
        int i = this.topo.getInfo();
        this.topo = this.topo.getProximo();
        return i;
    }

    public int peek(){
        return this.topo.getInfo();
    }

    public int search(int x){
        No aux = this.topo;
        int pos = 0;
        while(aux != null){
            if(aux.getInfo() == x){
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
        else{
            No aux = this.topo;
            while(aux!=null){
                s = s + aux.getInfo() + " ";
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }
}
