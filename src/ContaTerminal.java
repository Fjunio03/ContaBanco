import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int contaBanco = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo  = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe abaixo o número da sua conta:");
        contaBanco = scanner.nextInt();

        System.out.println("Agora, digite o número de sua agencia, com o dígito:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome e sobrenome:");
        nomeCliente = scanner.next();

        scanner.nextLine();

        System.out.println("Me informe o seu saldo:");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaBanco + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
