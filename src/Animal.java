public abstract class Animal {

    // ATRIBUTOS DA CLASSE ANIMAL
    private String nome;
    private int idade;
    private String especie;

    // CONSTRUTOR
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }
    // GET E SETS
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }
   // METODO ABSTRATO SEM PARAMETROS
    public abstract void EmitirSom();

    @Override
    public String toString() {
        return nome + " (" + especie + "), idade: " + idade;
    }
}
