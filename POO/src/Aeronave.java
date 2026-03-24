public class Aeronave {
     private String modelo;
    private int passageiros;
     private double velocidadeMaxima;
     private double capacidadeCombustivel;
     private  double queimaCombustivelMin;

    public void Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMin) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMin = queimaCombustivelMin;
    }

    public double tempoAr(){
          return capacidadeCombustivel/queimaCombustivelMin;
    }
    public double distancia(){
        return velocidadeMaxima*tempoAr();
    }

    public String getModelo() {
        return modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }
}
