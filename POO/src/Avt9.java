public class Avt9 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setVelocidada(50);

        carro.acelerar(10);
        System.out.println(carro.toString());

        carro.reduzir(20);
        System.out.println(carro.toString());

    }

}
