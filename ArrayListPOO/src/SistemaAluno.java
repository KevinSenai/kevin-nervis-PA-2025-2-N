import java.util.ArrayList;
import java.util.List;

public class SistemaAluno {
    private List<Aluno> listaAlunos;

    public  SistemaAluno(){
        listaAlunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno a){
        listaAlunos.add(a);
    }

    public List<Aluno> buscarAlunos(String curso, int idade, double media){
            if (curso == null || curso.isBlank() && idade <= 6 && media < 0){
                throw new IllegalAccessError("Erro algum valor Invalido");
            }

        List<Aluno> listaFilAlunos = new ArrayList<>();
                 for(Aluno a : listaAlunos){
                     if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idade && a.getMedia() >= media){
                         listaFilAlunos.add(a);
                     }
                 }
            return listaFilAlunos;
    }

    public Aluno buscarAlunos(int matriculaAluno){
        for(Aluno a : listaAlunos){
            if (a.getMatricula() == matriculaAluno){
                return a;
            }
        }
        return null;
    }

    //Expanção de Codigo

    /* public void exibirAlunoCurso() {
        System.out.println(" LISTA DE ALUNOS QUALIFICADOS ");
        List<Aluno> filtrados = buscarAlunos("Informatica", 20, 7);

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum aluno atende aos requisitos neste curso.");
        } else {
            for (Aluno a : filtrados) {
                System.out.println(a);
            }
        }
    }

    public void exibirMatricula(int matricula) {
        System.out.println(" RESULTADO DA BUSCA POR MATRÍCULA ");
        Aluno aluno = buscarMatricula(matricula);

        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
        }
    } */
}
