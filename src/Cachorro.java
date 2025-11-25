public class Cachorro extends Animal {

    // HERDOU OS ATRIBUTOS DA CLASSE PAI ANIMAL
    public Cachorro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }
   // UTILIZÇÃO DO METODO ABSTRATO DA CLASSE PAI ANIMAL COM MODIFICAÇÃO OVERRIDE
    @Override
    public void EmitirSom() {
        System.out.println("Au au");
    }
}
