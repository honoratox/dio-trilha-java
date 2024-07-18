public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"}; // Array de Strings
        
        for(int x=0; x<alunos.length; x++) { // Percorre o array de alunos enquanto x for menor que o tamanho do array
            System.out.println("Aluno: " + alunos[x]);
        }
    }   
}