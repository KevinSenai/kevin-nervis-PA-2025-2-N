public class Aluno {


    private String Nome;
    private int idade;
    private int matricula;
    private String curso;
    private double media;

    @Override
    public String toString() {
        return "=== FICHA DO ALUNO ===\n" +
                "Nome: " + Nome + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Curso: " + curso + "\n" +
                "Idade: " + idade + " anos\n" +
                "Média Final: " + media + "\n" +
                "======================";
    }

    public Aluno(String nome, int idade, int matricula, String curso, double media) {
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
        this.Nome = nome;
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

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double getMedia() {
        return media;
    }


}
