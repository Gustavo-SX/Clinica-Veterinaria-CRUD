public class Veterinario {

    // ATRIBUTOS
    private int idveterinario;
    private String nome;
    private String cpf;
    private String telefone;

    // CONSTRUTOR
    public Veterinario(int idveterinario, String nome, String cpf, String telefone) {
        this.idveterinario = idveterinario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
   // GET E SETS
    public int getidveterinario() {
        return idveterinario;
    }

    public String getnome() {
        return nome;
    }

    @Override
    public String toString() {
        return idveterinario + " - " + nome;
    }
}
