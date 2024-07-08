import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao Banco! Escolha uma opção:");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    String numeroConta = scanner.nextLine();
                    System.out.println("Digite o nome do titular:");
                    String titular = scanner.nextLine();
                    banco.criarConta(numeroConta, titular);
                    break;

                case 2:
                    System.out.println("Digite o número da conta:");
                    numeroConta = scanner.nextLine();
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(numeroConta, valorDeposito);
                    break;

                case 3:
                    System.out.println("Digite o número da conta:");
                    numeroConta = scanner.nextLine();
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(numeroConta, valorSaque);
                    break;

                case 4:
                    System.out.println("Digite o número da conta:");
                    numeroConta = scanner.nextLine();
                    banco.consultarSaldo(numeroConta);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
