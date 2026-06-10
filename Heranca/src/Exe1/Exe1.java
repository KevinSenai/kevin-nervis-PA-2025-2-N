package Exe1;
public class Exe1 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        System.out.println(circulo.calcularArea());

        Cilindro c1 = new Cilindro(5,2);
        System.out.println(c1.calcularVolume());
        System.out.println(c1.calcularArea());
    }
}
