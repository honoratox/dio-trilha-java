public class Operadores {
    public static void main (String [] args) throws Exception {
      
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){ // && ambas precisam ser validadas
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){ // || uma ou outra precisa ser validada
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}