import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome da sua agência: ");
        String nomeAgencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
