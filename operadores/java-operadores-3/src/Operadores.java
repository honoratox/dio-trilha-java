public class Operadores {
    public static void main (String [] args) throws Exception {
      
        int numero = 5;
        // x repeticao
        //numero++; // isso é igual numero = numero +1
        // o termo numero++ vai ler o numero atual e depois somar 1, ou seja, se a expressão for igual a abaixo

        System.out.println (numero++); // a primeira saída vai sar 5
        System.out.println (numero); // e a segunda ja vai ter incrementado +1 ao valor 5
        //System.out.println (++numero); nesse caso a incrementação foi feita antes de ler o valor
    }
}