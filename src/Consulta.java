import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

    private String data;
    private Animal animal;
    private Veterinario veterinario;

    public Consulta(String data, Animal animal, Veterinario veterinario) {
        this.data = data;
            this.animal = animal;
        this.veterinario = veterinario;
    }

    public String getData() {return data;}
        public void setData(String data) {this.data = data;}

    public Animal getAnimal() {return animal;}
        public void setAnimal(Animal animal) {this.animal = animal;}

    public Veterinario getVeterinario() {return veterinario;}
        public void setVeterinario(Veterinario veterinario) {this.veterinario = veterinario;}

    @Override
    public String toString() {
        return "\n consulta marcada" +
            "\n Dia: " + data +
                "\n Animal :" + animal.getNome() +
                "\n veterinário" + veterinario.getNome();
    }

    static ArrayList<Consulta> consulta = new ArrayList<Consulta>();
    static Scanner sc = new Scanner(System.in);

    public static void cadastraConsulta(){
        System.out.println("\n=== Cadastrar consulta: ===");

        listarAnimais();
        System.out.println("Digite o id do animal:");
        int idAnimal = sc.nextInt();
        Animal a = animal.get(idAnimal);

        listarVeterinarios();
        System.out.println("Digite o id do veterinario:");
        int idVeterinario = sc.nextInt();
        Veterinario v = veterinario.get(idVeterinario);

        sc.nextLine();
        System.out.println("Data da consulta");
        String data = sc.nextLine();

        Consulta consulta = new consulta(data, a, v);
        consultas.add(consulta);

        System.out.println("Consulta cadastrada com sucesso!");
    }

    public static void listarConsultas(){
        System.out.println("\n=== consultas: ===");

        if (consulta.isEmpty()){
            System.out.println("nenhuma consulta foi encontrada!");
            return;
        }
        for (int i = 0; i < consulta.size(); i++) {
            System.out.println("ID" + i +"-"+ consulta.get(i).toString());
        }
    }
    public static void atualizarConsulta(){
        listarConsultas();

        System.out.println("Digite o ID da consulta para atualizar:");
        int id = sc.nextInt();

        if (id<0 || id>consulta.size()){
            System.out.println("Nenhum consulta foi encontrada!");
            return;
        }
        Consulta c = consulta.get(id);
        sc.nextLine();

        System.out.println("Data da consulta" +c.getData());
        String novaData = sc.nextLine();
        c.setData(novaData);

        System.out.println("Consulta atualizada!");
    }

    public static void removerConsulta(){
        listarConsultas();

        System.out.println("Digite o ID da consulta para remover:");
        int id = sc.nextInt();

        if (id<0 || id>consulta.size()){
            System.out.println("Nenhum consulta foi encontrada!");
            return;
        }
        consulta.remove(id);

        System.out.println("Consulta removida!");
    }

}
