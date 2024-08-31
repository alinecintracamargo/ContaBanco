import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Instanciar o Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo inicial:");
        scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco. Sua agência é " 
            + numeroAgencia + ", conta " + numeroConta + " e seu saldo é " + saldo + ", já disponível para saque.");

        // Fechar o Scanner
        scanner.close();
    }
}
