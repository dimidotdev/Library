import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Buscar livro");
            System.out.println("5 - Emprestar livro");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Editar livro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, ano);
                    livraria.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    livro = livraria.buscarLivro(titulo);
                    if (livro != null) {
                        livraria.removerLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 3:
                    livraria.listarLivros();
                    break;
                case 4:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    livro = livraria.buscarLivro(titulo);
                    if (livro != null) {
                        System.out.println(livro);
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 5:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    livraria.emprestarLivro(titulo);
                    break;
                case 6:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    livraria.devolverLivro(titulo);
                    break;
                case 7:
                    System.out.print("Título: ");
                    titulo = scanner.nextLine();
                    System.out.print("Novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo autor: ");
                    String novoAutor = scanner.nextLine();
                    System.out.print("Novo ano: ");
                    int novo = scanner.nextInt();
                    scanner.nextLine();
                    livraria.editarLivro(titulo, novoTitulo, novoAutor, novo);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}