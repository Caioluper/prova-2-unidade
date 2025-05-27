
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Filme> catalogo = new ListaEncadeada<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Catálogo de Filmes ---");
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Atualizar Filme");
            System.out.println("4 - Remover Filme");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Filme: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();

                    Filme novoFilme = new Filme(nome, genero, nota);
                    catalogo.adicionar(novoFilme);
                    System.out.println("Filme adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Filmes ---");
                    catalogo.listar();
                    break;

                case 3:
                    System.out.print("Nome do Filme a Atualizar: ");
                    String nomeAntigo = scanner.nextLine();
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();
                    System.out.print("Nova Nota: ");
                    double novaNota = scanner.nextDouble();
                    scanner.nextLine();

                    Filme filmeAntigo = new Filme(nomeAntigo, "", 0);
                    Filme filmeNovo = new Filme(nomeAntigo, novoGenero, novaNota);

                    if (catalogo.atualizar(filmeAntigo, filmeNovo)) {
                        System.out.println("Filme atualizado!");
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nome do Filme a Remover: ");
                    String nomeRemover = scanner.nextLine();
                    Filme filmeRemover = new Filme(nomeRemover, "", 0);

                    if (catalogo.remover(filmeRemover)) {
                        System.out.println("Filme removido!");
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
