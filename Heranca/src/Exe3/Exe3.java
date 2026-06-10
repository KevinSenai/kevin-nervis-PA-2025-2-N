package Exe3;

public class Exe3 {
    public static void main(String[] args) {
        cachorro c = new cachorro("cachorro", 25.00,"Pastor Alemão");
        gato g = new gato("Gatinho",7.0,false);

        System.out.println(c.toString());
        System.out.println(c.emitirSom());

        System.out.println(g.toString());
        System.out.println(g.emitirSom());
    }
}
