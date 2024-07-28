public class Cliente {
    private String nome;
    private int idade;
    //private Conta conta;
    private String perfil;

    //contrutores
    public Cliente(String nome, int idade, String perfil) {
        this.nome = nome;
        this.idade = idade;
        this.perfil = perfil;
    }

    //get and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", perfil='" + perfil + '\'' +
                '}';
    }
}
