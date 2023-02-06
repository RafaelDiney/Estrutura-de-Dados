public class No{
    private int info;
    private No proximo;

    public No (int info){
        this.info = info; //this referencia do atributo da entidade o outro info é a variavel da classe
        this.proximo = null;
    }
        //métodos de acesso
        public int getInfo(){
            return this.info;
        }

        public No getProximo(){
            return this.proximo;
        }

        //Métodos modificadores
        public void setinfo (int info){
            this.info = info;
        }

        public void setProximo (No proximo){
            this.proximo = proximo;
        }
        //sobrescrita do método toString
        //boas práticas utilizam uma anotação 
        @Override
        public String toString(){
            return "[" + this.info + "]";
        }
    }
