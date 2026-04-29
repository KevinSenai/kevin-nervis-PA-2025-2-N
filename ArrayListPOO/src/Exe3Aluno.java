import java.util.List;

public class Exe3Aluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 18, 01, "Informatica", 7);
        Aluno aluno2 = new Aluno("João", 20, 02, "Informatica", 7);
        Aluno aluno3 = new Aluno("Edu", 21, 03, "Informatica", 7);
        Aluno aluno4 = new Aluno("Romero", 16, 04, "Informatica", 7);
        Aluno aluno5 = new Aluno("Kevin", 20, 05, "Informatica", 7);
        Aluno aluno6 = new Aluno("Yuri", 17, 06, "Informatica", 7);

        SistemaAluno sistema = new SistemaAluno();
        sistema.addAluno(aluno1);
        sistema.addAluno(aluno2);
        sistema.addAluno(aluno3);
        sistema.addAluno(aluno4);
        sistema.addAluno(aluno5);
        sistema.addAluno(aluno6);

        sistema.exibirAlunoCurso("Informatica");
        System.out.println("\n");
        sistema.exibirMatricula(6);
    }
}
