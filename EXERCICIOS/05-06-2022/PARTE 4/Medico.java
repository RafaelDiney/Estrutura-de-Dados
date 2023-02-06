public class Medico extends Pessoa {
    private int crm;
    private String especialidade;
    public Medico (int anoNascimento, String nome, int crm, String especialidade){
        super(anoNascimento, nome);
        setCrm(crm);
        setEspecialidade(especialidade);
    }
    public int getCrm(){
        return this.crm;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setCrm(int crm){
        this.crm = crm;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade= especialidade;
    }
    @Override
    public String toString(){
        return super.toString() + ", crm " + this.crm + " com especialidade " + this.especialidade;
    }
}   
