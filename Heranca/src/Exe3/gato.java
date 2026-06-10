
package Exe3;
public class gato extends Animal{
    private boolean castrado;

    @Override
    public String toString() {
        return super.toString() + "gato{" +
                "castrado=" + castrado +
                '}';
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public gato(String especie, Double peso, boolean castrado) {
        super(especie, peso);
        setCastrado(castrado);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}
