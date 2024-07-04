public class Operadores {
    public static void main (String [] args) throws Exception {
      
       int a,b;
       a = 6;
       b = 6;

       /*String resultado = ""; o campo da string é "" porque ainda não sabemos o resultado

       if(a==b)
            resultado = "veerdadeiro";
       else
            resultado = "falso";

        System.out.println (resultado);*/

        //PORÉM TEM UMA MANEIRA ABREVIADA DE FAZER ISSO, USANDO O OPERADOR TERNÁRIO

        String resultado = a==b ? "verdadeiro" : "falso"; // o que ta escrito é a é igual a b? caso sim(?) digite verdadeiro, caso não (:) digite "falso"

        System.out.println(resultado);
    }
}