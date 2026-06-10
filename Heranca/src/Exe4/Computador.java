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
        if (conectado == true){
            return true;
        }
        return false;
    }

    @Override
    public boolean desligar() {
        if (ligar() == true){
            return true;
        }
        return false;
    }

    @Override
    public String obterStatus() {
        if (desligar() == true){
            return "Ligado";
        }
        return "Desligado";
    }
}
