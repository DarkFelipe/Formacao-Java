public class ExemploForArray {
    

    public static void main (String[] args){
        String alunos[] = {"Felipe", "Jonas", "Pedro", "Santiago"};

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("O aluno no índice i = " + i + " é " + alunos [i]);
            
        }

        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " +aluno);
        }
    }
}
