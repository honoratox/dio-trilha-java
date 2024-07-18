import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo ao caixa eletrônico");

        Float saldoAtual = 10000.0f;

        System.out.println("Digite o valor que deseja sacar: ");
        Float valorSaque = scanner.nextFloat();

        if(valorSaque < saldoAtual){
            saldoAtual = saldoAtual - valorSaque;

            System.out.println("Você acabou de sacar R$ " + valorSaque + " e seu saldo atual é de R$ " + saldoAtual);
        }
    }
}
