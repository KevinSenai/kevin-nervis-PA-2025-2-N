import java.util.ArrayList;
import java.util.List;

public class SistemaAluno {
    private List<Aluno> ListaAlunos;

    public  SistemaAluno(){
        ListaAlunos = new ArrayList<>();
    }
    public void addAluno(Aluno aluno){
        ListaAlunos.add(aluno);
    }
    public List<Aluno> BuscarAluno(String Curso){
        List<Aluno> listAluno = new ArrayList<>();

        for ( Aluno aluno : ListaAlunos){
            if (aluno.getIdade() >= 18 && aluno.getCurso().equalsIgnoreCase(Curso) && aluno.getMedia() >= 7){
                listAluno.add(aluno);
            }
        }
        return  listAluno;
    }

    public Aluno buscarMatricula(int matriculaAluno){
        for(Aluno aluno : ListaAlunos){
            if (aluno.getMatricula() == matriculaAluno){
                return aluno;
            }
        }
        return null;
    }

    public void exibirAlunoCurso(String curso) {
        System.out.println("--- LISTA DE ALUNOS QUALIFICADOS (" + curso+ ") ---");
        List<Aluno> filtrados = BuscarAluno(curso);

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum aluno atende aos requisitos neste curso.");
        } else {
            for (Aluno a : filtrados) {
                System.out.println(a);
            }
        }
    }

    public void exibirMatricula(int matricula) {
        System.out.println("--- RESULTADO DA BUSCA POR MATRÍCULA ---");
        Aluno aluno = buscarMatricula(matricula);

        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
        }
    }
}
