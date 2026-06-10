package Exe1;
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double calcularArea(){
        return Math.pow(raio, 2);
    }

    public void setRaio(double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("Raio Invalido!");
        }
        this.raio = raio;
    }
}

