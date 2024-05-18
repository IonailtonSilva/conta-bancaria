
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void  main(String[] args){

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite Numero de Sua Agencia: ");
            int agencia = scanner.nextInt();

            System.out.println("Digite o Numero de Sua Conta: ");
            String conta = scanner.next();

            System.out.println("Digite Seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digite Seu Saldo ");
            Double saldo = scanner.nextDouble();

            System.out.println(agencia);
            System.out.println(conta);
            System.out.println(nome);
            System.out.println(saldo);
        }

    }
    
}
