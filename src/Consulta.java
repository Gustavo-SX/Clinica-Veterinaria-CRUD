public class Consulta {

    // ATRIBUTOS
    private String data;
    private Animal animal;
    private Veterinario veterinario;

    // CONSTRUTOR
    public Consulta(String data, Animal animal, Veterinario veterinario) {
        this.data = data;
        this.animal = animal;
        this.veterinario = veterinario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data: " + data + " | Animal: " + animal.getNome() +
                " | Veterinário: " + veterinario.getnome();
    }
}
