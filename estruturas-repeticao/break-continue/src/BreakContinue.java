public class BreakContinue{
    public static void main(String[] args){
        for(int numero =1; numero <=5; numero++){ // recorre os numeros de 1 a 5
            /*
            if(numero ==3){ // se o numero for igual a 3
                break; // interrompe o loop
            }
            System.out.println("numero = " + numero);
            */
            if(numero ==3){ // se o numero for igual a 3
                continue; // interrompe a execução atual e vai para a proxima
            }
            System.out.println("numero = " + numero);
        }
    }
}