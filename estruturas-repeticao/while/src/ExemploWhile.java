import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile{
    public static void main(String[] args){
       double mesada = 50.0;
       while(mesada>0){
        Double valorDoce = valorAleatorio(); // Chama a função valorAleatorio
        if(valorDoce>mesada){
            valorDoce = mesada; // Se o valor do doce for maior que a mesada, o valor do doce será igual a mesada
        }
        System.out.println("Doce do valor de: " + valorDoce + "foi comprado");
        mesada = mesada - valorDoce; // Subtrai o valor do doce da mesada

       }

       if(mesada == 0){
           System.out.println("Mesada acabou");
       }
       System.out.println("Mesada: "+ mesada);
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}