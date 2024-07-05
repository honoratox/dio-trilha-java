import  java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //criando o objeto scanner

        System.out.println ("Digite seu nome: ");
        String nome = scanner.next(); // 'next' indica que é pra pegar a próxima entrada e associar a variável que nós designarmos

        System.out.println ("Digite seu sobrenome: ");
        String sobrenome = scanner.next(); // com string não precisa colocar o tipo de variável, mas nos demais casos precisa

        System.out.println ("digite sua idade: ");
        int idade = scanner.nextInt(); // 'nextDouble', apenas informa que a próxima entrada(next) é do tipo int

        System.out.println ("Digite sua altura: ");
        double altura = scanner.nextDouble(); // 'nextDouble', apenas informa que a próxima entrada(next) é do tipo double


        //imprimir tudo
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", " + "tenho " + idade + " anos e " + altura + " cm de altura");
    }
}
