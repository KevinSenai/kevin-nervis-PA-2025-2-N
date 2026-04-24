public class SistemaAluno {
    private String Nome;
    private int idade;
    private int matricula;
    private String curso;
    private double media;

    public SistemaAluno(String nome, int idade, int matricula, String curso, double media) {
        setNomeAluno(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMedia(media);
    }

    public void setNomeAluno(String nome) {
        if (nome == null || nome.isBlank()){
            new IllegalAccessError("Nome Inválido");
        }
        Nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0){
            new IllegalAccessError("Idade Inválida");
        }
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0){
            new IllegalAccessError("Matricula Inválida");
        }
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            new IllegalAccessError("Curso Inválido");
        }
        this.curso = curso;
    }

    public void setMedia(double media) {
        if (media < 0){
            new IllegalAccessError("Media Inválida");
        }
        this.media = media;
    }


}
