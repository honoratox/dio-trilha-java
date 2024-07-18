import java.util.Random;

public class ExemploDoWhile{
    public static void main(String[] args){
      System.out.println("Discando...");
      do{ // executa pelo menos uma vez

        System.out.println("telefone tocando"); 

      }while (tocando());

      System.out.println("Alô!!"); // imprime quando atendeu
    }

    private static boolean tocando(){ // simula se o telefone foi atendido
        boolean atendeu = new Random().nextBoolean(); // gera um valor aleatório booleano (true ou false)
        System.out.println("Atendeu? "+ atendeu); // imprime se atendeu ou não

        return ! atendeu;
    }
}