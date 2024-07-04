public class Operadores {
    public static void main (String [] args) throws Exception {

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; //somou os 1+1+1 e deixou a string "1"
        System.out.println (concatenacao);

        concatenacao = 1+"1"+1+1; // 1 número e logo em seguida um texo, ai ele printa a concatenação dda string
        System.out.println (concatenacao);

        concatenacao = 1+"1"+1+"1"; // 1 número e dps concatenou, ai para de fazer operações matemáticas
        System.out.println (concatenacao);

        concatenacao = "1"+(1+1+1); //concatenou em texto, porém tem uma expressão em evidência dentro dos colchetes
        System.out.println (concatenacao);
    }
}