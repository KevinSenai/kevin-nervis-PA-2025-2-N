public class Contribuinte {
     String nome;
     String cpf;
     String UF;

    double rendaAnual;

    public Contribuinte(String nome, String cpf, String UF, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.UF = UF;
        this.rendaAnual = rendaAnual;
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

