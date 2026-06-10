package Exe3;

public abstract class Animal {
    private String especie;
    private Double peso;

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", peso=" + peso +
                '}';
    }
    public Animal(String especie, Double peso) {
        setEspecie(especie);
        setPeso(peso);
    }

    public abstract String emitirSom();

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}
