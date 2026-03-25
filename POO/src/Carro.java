public class Carro {
    double velocidade;

    @Override
    public String toString() {
        return "velocidade: " + velocidade;
    }

    public void setVelocidada(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int valor){
        if(valor >= 0 && valor < 20){
            setVelocidada(velocidade+valor);
        }else{
            System.out.println("Valor para acelerar Invalido");
        }

    }
    public void reduzir(int valor){
        if(valor >= 0 && valor< 30){
            setVelocidada(velocidade-valor);
        }else{
            System.out.println("Valor para Reduzir Invalido");
        }
    }
}
