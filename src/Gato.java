public class Gato extends Animal {

    // ATRIBUTOS HERDADOS DA CLASSE PAI ANIMAL
    public Gato(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
   // METODO HERDADO DA CLASSE PAI ANIMAL
    @Override
    public void EmitirSom() {
        System.out.println("Miau miau");
    }
}
