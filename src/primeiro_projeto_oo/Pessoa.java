package primeiro_projeto_oo;

public abstract class Pessoa  implements  Autenticacao{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
