package Exe4;

public class Computador implements Dispositivo{
    private String modelo;
    private boolean conectado;

    public Computador(String modelo, boolean conectado) {
        setModelo(modelo);
        setConectado(conectado);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public boolean ligar() {
        return conectado;
    }

    @Override
    public boolean desligar() {
        return ligar();
    }

    @Override
    public String obterStatus() {
        if (conectado){
            return "Computador " + modelo + " esta Ligado";
        }
        return "Computador " + modelo + " Desligado";
    }
}
