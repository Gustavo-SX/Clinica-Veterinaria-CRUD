import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaPetMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ARRAY LIST ANIMAL, VETERINARIO E CONSULTAS PARA ARMAZENAMENTO DE INFORMARCÕES
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();
        // VARIAVEL OPC PARA SALVAR O NUMERO DIGITADO NO SWITCH CASE
        int opc;

        do {
            System.out.println("\n===== CLÍNICA VETERINÁRIA =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Cadastrar Veterinário");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Listar Animais");
            System.out.println("5 - Listar Veterinários");
            System.out.println("6 - Listar Consultas");
            System.out.println("7 - Remover Consulta");
            System.out.println("8 - Atualizar Consulta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Nome do animal: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Espécie (cachorro/gato): ");
                    String especie = sc.nextLine().toLowerCase();

                    Animal a = null;
                    if (especie.equals("cachorro")) {
                        a = new Cachorro(nome, idade, especie);
                    } else if (especie.equals("gato")) {
                        a = new Gato(nome, idade, especie);
                    } else {
                        System.out.println("Espécie inválida!");
                        break;
                    }

                    animais.add(a);
                    System.out.println("Animal cadastrado!");
                    break;

                case 2:
                    System.out.println("Digite o ID do veterinário:");
                    int idvet = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nome:");
                    String nv = sc.nextLine();

                    System.out.println("CPF:");
                    String cpf = sc.nextLine();

                    System.out.println("Telefone:");
                    String tel = sc.nextLine();

                    veterinarios.add(new Veterinario(idvet, nv, cpf, tel));
                    System.out.println("Veterinário cadastrado!");
                    break;

                case 3:
                    if (animais.isEmpty() || veterinarios.isEmpty()) {
                        System.out.println("Cadastre um animal e um veterinário antes!");
                        break;
                    }

                    System.out.print("Data da consulta: ");
                    String data = sc.nextLine();

                    System.out.println("Selecione o animal:");
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println(i + " - " + animais.get(i).getNome());
                    }
                    int ia = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Selecione o veterinário:");
                    for (int i = 0; i < veterinarios.size(); i++) {
                        System.out.println(i + " - " + veterinarios.get(i).getnome());
                    }
                    int iv = sc.nextInt();
                    sc.nextLine();

                    consultas.add(new Consulta(data, animais.get(ia), veterinarios.get(iv)));
                    System.out.println("Consulta agendada!");
                    break;

                case 4:
                    System.out.println("\n--- Lista de Animais ---");
                    for (Animal an : animais) {
                        System.out.println(an);
                    }
                    break;

                case 5:
                    System.out.println("\n--- Lista de Veterinários ---");
                    for (Veterinario v : veterinarios) {
                        System.out.println(v);
                    }
                    break;

                case 6:
                    System.out.println("\n--- Consultas ---");
                    for (int i = 0; i < consultas.size(); i++) {
                        System.out.println("ID " + i + ": " + consultas.get(i));
                    }
                    break;

                case 7:
                    System.out.println("\nID da consulta para remover:");
                    int idr = sc.nextInt();
                    if (idr >= 0 && idr < consultas.size()) {
                        consultas.remove(idr);
                        System.out.println("Consulta removida!");
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 8:
                    System.out.println("\nID da consulta para atualizar:");
                    int idu = sc.nextInt();
                    sc.nextLine();

                    if (idu >= 0 && idu < consultas.size()) {
                        System.out.println("Nova data:");
                        String nd = sc.nextLine();
                        consultas.get(idu).setData(nd);
                        System.out.println("Consulta atualizada!");
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 0);

        sc.close();
    }
}
