public class Livro {
    private String Titulo;
    private boolean Emprestado;

    public void setEmprestado() {
        Emprestado = false;
    }

    @Override
    public String toString() {
        if (Emprestado){
            return Titulo + "- Status: Emprestado ";
        }else {
            return Titulo + " - Status: Devolvido";
        }
    }

    public Livro(String titulo) {
        setTitulo(titulo);
        setEmprestado(Emprestadod);
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void emprestar(){
        return Emprestado = true;

    }
    public boolean devolver(){
        return Emprestado = false;
    }
}
