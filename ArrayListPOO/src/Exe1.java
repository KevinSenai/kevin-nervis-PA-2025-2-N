import java.util.Collections;

public class Exe1 {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(1, 2);
        Retangulo r2 = new Retangulo(2, 3);
        Retangulo r3 = new Retangulo(3,4);
        Retangulo r4 = new Retangulo(4, 5);

        BdRetangulos c1 = new BdRetangulos();

        c1.addRetagunlo(r1);
        c1.addRetagunlo(r2);
        c1.addRetagunlo(r3);
        c1.addRetagunlo(r4);

        System.out.println("Maior Area: " +c1.MaiorArea());
        System.out.println("Maior Perimetro: "+ c1.MaiorPerimetro());
    }
}
