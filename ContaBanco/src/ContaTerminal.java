import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o Numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a Agencia:  ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o Saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
