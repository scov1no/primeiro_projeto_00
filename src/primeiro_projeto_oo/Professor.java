package primeiro_projeto_oo;

public class Professor extends Pessoa {

    private Double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return false;
    }
}
