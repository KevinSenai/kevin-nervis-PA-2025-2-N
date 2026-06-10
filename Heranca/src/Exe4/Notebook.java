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
        if (conectado == true || bateria > 10){
            if (bateria <= 0){
                throw new IllegalArgumentException("Bateria Negativa");
            }
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
