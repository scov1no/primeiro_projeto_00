package primeiro_projeto_oo;

public class ProfessorHorista extends Professor{
    private int qtdHoras;


    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getSalario(){
        return super.getSalario() * qtdHoras;
    }

    public void setHoras(int i) {
    }
}
