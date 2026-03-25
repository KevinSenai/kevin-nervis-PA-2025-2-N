public class OnibusEscolar {
    int Alunos;
    int Professores;

    public OnibusEscolar(int Alunos, int professores) {
        Professores = professores;
        setAlunos(Alunos);
    }
    public void setAlunos(int Alunos){
        this.Alunos = Alunos;
        if (Professores == 0){
            this.Alunos = 0;
        }else if (Alunos > 40) {
            this.Alunos = 40;
        }
    }
    @Override
    public String toString() {
        return "Quantidade de Alunos:" + Alunos + "\nQuantidade Professores: " + Professores;
    }



}
