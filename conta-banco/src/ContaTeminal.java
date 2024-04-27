import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite seu nome: ");
    String nome = scanner.next();

    System.out.print("Digite o número da agência: ");
    String agencia = scanner.next();

    System.out.print("Digite o número da conta: ");
    int numero = scanner.nextInt();

    System.out.print("Digite o saldo da conta: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
  }
}