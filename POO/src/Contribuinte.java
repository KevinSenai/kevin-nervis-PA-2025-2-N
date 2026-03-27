public class Contribuinte {
     private String nome;
     private String cpf;
     private String UF;
    double rendaAnual;

    @Override
    public String toString() {


        return String.format("Nome: %s\nImposto: %.2f",nome,impostoPagar());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setRendaAnual(double rendaAnual) {

        if (rendaAnual < 0){
            System.out.println("Erro Valor de Renda Negativa!");
        }else{
            this.rendaAnual = rendaAnual;
        }
    }

    public Contribuinte(String nome, String cpf, String UF, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUF(UF);
        setRendaAnual(rendaAnual);
    }
    public double impostoPagar() {
        double aliquota;
        if (rendaAnual <= 4000){
            aliquota = 0;
        } else if (rendaAnual <= 9000) {
            aliquota = 0.058;
        } else if (rendaAnual <= 25000) {
            aliquota = 0.15;
        } else if (rendaAnual <= 35000) {
            aliquota = 0.275;
        } else {
            aliquota = 0.30;
        }
        return rendaAnual * aliquota;
    }
}

