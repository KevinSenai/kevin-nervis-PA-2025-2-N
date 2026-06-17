package Exe4;

public class Notebook implements Dispositivo{
    private String modelo;
    private int bateria;
    private boolean conectado;

    public Notebook(String modelo, int bateria, boolean conectado) {
        setBateria(bateria);
        setConectado(conectado);
        setBateria(bateria);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public boolean ligar() {
        return conectado || bateria >= 10;
    }

    @Override
    public boolean desligar() {
        return ligar();
    }

    @Override
    public String obterStatus() {
        if (conectado){
            return "Ligado";
        }
            return "Desligado";
    }
}
