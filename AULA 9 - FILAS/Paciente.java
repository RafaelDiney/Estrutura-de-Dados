public class Paciente extends Pessoa {
    private int numAssociado;
    public Paciente(String nome, int anoNascimento, int numAssociado){
        super(anoNascimento, nome); //Puxa os atributos do PAI
        setNumAssociado(numAssociado);
    }

    public int getNumAssociado(){
        return this.numAssociado;
    }
    public void setNumAssociado(int numAssociado){
        this.numAssociado = numAssociado;
    }

    @Override
    public String toString(){
        return super.toString() + ", associado numero " + this.numAssociado;
    }
}
