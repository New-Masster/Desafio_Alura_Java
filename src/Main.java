import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Roger Rabbit";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.printf("***********************");
        System.out.println("\nNome do Cliente: "+nome);
        System.out.println("Tipo conta: "+tipoConta);
        System.out.println("Saldo atual: "+saldo);
        System.out.printf("***********************");

        String menu = """
                ** DIGITE A OÇÃO DESEJADA **
                1 - Consultar Saldo
                2 - Realizar Transferência
                3 - Valor Recebido
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(" ");
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
            System.out.print("Seu saldo atual é de R$ "+saldo);
            System.out.println(" ");
            } else if (opcao == 2) {
                System.out.print("Digite o valor para transferência: R$ ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.\n");
                }else {
                    saldo -= valor;
                    System.out.print("Seu saldo atual é de R$ "+saldo);
                    System.out.println(" ");
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.print("Seu saldo atual é de R$ "+saldo);
                System.out.println(" ");
            } else if (opcao != 4) {
            System.out.println("Opção inválida. Digite uma opção de 1 à 4!");
            }
        }
    }
}