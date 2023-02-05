import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o seu nome");
        Scanner nc = new Scanner(System.in);
        String nomeCliente = nc.next();
        

        System.out.println("Por favor, digite o número da Agência");
        Scanner ag = new Scanner(System.in);
        String agencia = ag.next();
        
        System.out.println("Por favor, digite o número da conta");
        Scanner cont = new Scanner(System.in);
        int conta = cont.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +conta+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
