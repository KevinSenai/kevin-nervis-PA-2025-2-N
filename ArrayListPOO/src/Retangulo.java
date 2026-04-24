public class Retangulo {
    private double altura;
    private double largura;

    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", largura=" + largura + '}';
    }

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double Area(){
        return largura*altura;
    }
    public  double Perimetro(){
        return (largura+altura)*2;
    }


    public void setAltura(double altura) {
        if (altura <= 0){
            new IllegalAccessError("Altura Inválida");
        }
        this.altura = altura;
    }

    public void setLargura(double largura) {
        if (largura <= 0){
            new IllegalAccessError("Largura Inválida");
        }
        this.largura = largura;
    }
}
