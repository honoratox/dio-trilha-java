public class Operadores {
    public static void main (String [] args) throws Exception {
        
        int numero = 5;
        numero = -numero; //o numero = ele mesmo, porem negativo
        //System.out.println (- numero);// o '-' inverteu o valor da variável
        System.out.println (numero);

        numero = numero * -1; //como o número agora está negativo, devemos invertes, porém '+' é um operador lógico de soma, então devemos multiplicar por -1
        System.out.println(numero);

    }
}