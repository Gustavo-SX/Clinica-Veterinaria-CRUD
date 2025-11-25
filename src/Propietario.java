public class Propietario {

    //atributos
    private String nome;
    private int cpf;
    private int telefone;
    private String endereco;
    private String nomedoanimal;
    private int iddoanimal;

    //construtor
    public Propietario(String nome, int cpf, int telefone, String endereco, String nomedoanimal, int iddoanimal) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomedoanimal = nomedoanimal;
        this.iddoanimal = iddoanimal;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomedoanimal() {
        return nomedoanimal;
    }

    public void setNomedoanimal(String nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }

    public int getIddoanimal() {
        return iddoanimal;
    }

    public void setIddoanimal(int iddoanimal) {
        this.iddoanimal = iddoanimal;
    }


    public void exibir() {
        System.out.println("Nome do Propietario: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);
        System.out.println("Nomedoanimal: " + nomedoanimal);
        System.out.println("Iddoanimal: " + iddoanimal);
    }
}