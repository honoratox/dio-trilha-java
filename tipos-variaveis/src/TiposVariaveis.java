public class TiposVariaveis {
    
    public static void main (String [] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //variáveis x constantes
        final int NUMERO = 5; //defini como constante
        NUMERO = 10; //aqui daria erro, porque tento modificar a variavel

        System.out.print (NUMERO);
    }
}