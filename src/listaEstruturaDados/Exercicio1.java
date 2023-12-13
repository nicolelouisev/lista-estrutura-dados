package listaEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    chamarCliente(filaClientes);
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
        System.out.println("1: Adicionar cliente na fila");
        System.out.println("2: Listar clientes na fila");
        System.out.println("3: Retirar cliente da fila");
        System.out.println("0: Finalizar programa");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        filaClientes.add(nomeCliente);
        System.out.println("Cliente adicionado à fila.");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("\nClientes na fila:");
            for (String cliente : filaClientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia. Não há clientes para chamar.");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("Cliente chamado: " + clienteChamado);
        }
    }
}
