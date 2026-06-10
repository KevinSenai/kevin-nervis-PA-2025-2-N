package Exe1;
public class Cilindro extends Circulo{
    private double altura;


    public Cilindro(double raio, double altura) {
        super(raio);
        setAltura(altura);
    }

    public double calcularVolume(){
        return super.calcularArea()*altura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            throw new IllegalArgumentException("Altura Invalida!");
        }
        this.altura = altura;

    }
}
