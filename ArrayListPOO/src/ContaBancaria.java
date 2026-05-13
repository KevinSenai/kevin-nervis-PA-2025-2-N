public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Nome do Titular Invalida!");
        }
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {return saldo;}
    public String getNomeTitular() {return nomeTitular;}

}
