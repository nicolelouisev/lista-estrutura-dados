package listaEstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2  {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro(pilhaLivros, scanner);
                    break;
                case 2:
                    listarLivros(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar Livro na pilha");
        System.out.println("2: Listar Livros na pilha");
        System.out.println("3: Retirar Livro da pilha");
        System.out.println("0: Finalizar programa");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
        System.out.print("Digite o nome do Livro: ");
        String nomeLivro = scanner.nextLine();
        pilhaLivros.push(nomeLivro);
        System.out.println("Livro adicionado à pilha.");
    }

    private static void listarLivros(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("\nLivros na pilha:");
            for (String livro : pilhaLivros) {
                System.out.println(livro);
            }
        }
    }

    private static void retirarLivro(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia. Não há livros para retirar.");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("Livro retirado: " + livroRetirado);
        }
    }
}

