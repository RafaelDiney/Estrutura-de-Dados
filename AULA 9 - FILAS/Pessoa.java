public class Pessoa{
    private int anoNascimento;
    private String nome;
    public Pessoa(int anoNascimento, String nome){
        setAnoNascimento(anoNascimento);
        setNome(nome);
    }
    public int getAnoNacimento(){
        return this.anoNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome + " nascido em " + this.anoNascimento;
    }
}