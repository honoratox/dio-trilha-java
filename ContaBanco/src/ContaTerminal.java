import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[]args) throws Exception{

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println ("Bem vindo cliente!\n Por favor, entre com os seus dados abaixo.");

        System.out.println ("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println ("Insira seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println ("Insira o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println ("Insira sua agência: ");
        String numeroAgencia = scanner.next();

        System.out.println ("Insira o saldo atual da conta: ");
        float saldo = scanner.nextFloat();


        System.out.println("Olá " + nome + " " + sobrenome + ", voê está tentando criar uma conta em nosso banco com os seguintes dados, conta " + numeroConta + ", agência " + numeroAgencia + ", com saldo atual de R$" + saldo);

        System.out.println ("Você confirma essa afirmação? Se sim, tecle 1");
        int confirmar = scanner.nextInt();

        if(confirmar==1){
            System.out.println("Parabéns! Sua conta foi criada com sucesso e seu saldo de R$" + saldo + " já está disponível para saque");
        }
        else{
            System.out.println("Ops! Parece que ocorreu um erro");;
        }
    }
}
