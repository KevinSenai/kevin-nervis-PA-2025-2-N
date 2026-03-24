public class Atv7 {
    public static void main(String[] args) {

        Aeronave[] aeronave = new Aeronave[4];
         aeronave[0] = new Aeronave();
         aeronave[1] = new Aeronave();
         aeronave[2] = new Aeronave();
         aeronave[3] = new Aeronave();

        aeronave[0].Aeronave("Cinderela",350,3000,1000,50 );

        aeronave[1].Aeronave("Atlas", 200, 2500, 1000, 25);

        aeronave[2].Aeronave("Etheria", 525, 6000, 1000, 70);

        aeronave[3].Aeronave("Alfa", 450, 10000, 2000, 100);

        Aeronave maior = aeronave[0];
        for (int i = 0; i < aeronave.length; i++){
            if (aeronave[i].getPassageiros() > maior.getPassageiros()){
                maior = aeronave[i];
            }
        }

        Aeronave tempoAr = aeronave[0];
        for (int i = 0; i < aeronave.length; i++){
            if (aeronave[i].tempoAr() > tempoAr.getPassageiros()){
                tempoAr = aeronave[i];
            }
        }
        Aeronave MaiorDistancia = aeronave[0];
        for (int i = 0; i < aeronave.length; i++){
            if (aeronave[i].distancia() > MaiorDistancia.getPassageiros()){
                MaiorDistancia = aeronave[i];
            }
        }

        System.out.println("Leva maior numero de passageiro: " + maior.getModelo());
        System.out.println("Fica mais tempo no ar: " + tempoAr.getModelo());
        System.out.println("Maior Distancia: "+MaiorDistancia.getModelo());

    }
}