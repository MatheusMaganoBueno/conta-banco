import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o numero da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da Conta");
        double conta = scanner.nextDouble();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.print(" Ola " + nome + " " + sobrenome );
        System.out.print(" obrigado por criar uma conta em nosso banco");
        System.out.print(" sua agência é " + agencia);
        System.out.print(", conta " + conta);
        System.out.print(" e seu saldo "  + saldo +  " já está disponível para saque!");


    }
}