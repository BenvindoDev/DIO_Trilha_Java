import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite um número para sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite um número para sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo que você gostaria de depositar: ");
        double saldoDepositado = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta " + numeroConta + " e o saldo depositado no valor de R$ " + saldoDepositado + " já está diponível para saque."  );

    }
}
