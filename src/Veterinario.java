public class Veterinario {
    //atributos
    private int idveterinario;
    private String nome;
    private int cpf;
    private int telefone;


    //construtor
    public Veterinario(int idveterinario, String nome, int cpf, int telefone) {
        this.idveterinario = idveterinario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }
    //gets e sets
    public int getidveterinario() {
        return idveterinario;
    }
    public void setidveterinario(int idveterinario) {
        this.idveterinario = idveterinario;
    }
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public int getcpf() {
        return cpf;
    }
    public void setcpf(int cpf) {
        this.cpf = cpf;
    }
    public int gettelefone() {
        return telefone;
    }
    public void settelefone(int telefone) {
        this.telefone = telefone;
    }
    //exibir detalhes do veterinario
    public void exibir(){
        System.out.printf("idveterinario: ", idveterinario);
        System.out.printf("nome: ", nome);
        System.out.printf("cpf: ", cpf);
        System.out.printf("telefone: ", telefone);
    }

}
