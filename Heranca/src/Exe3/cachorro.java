package Exe3;

public class cachorro extends Animal{
    private String race;

    @Override
    public String toString() {
        return super.toString() + "cachorro{" +
                "race='" + race + '\'' +
                '}';
    }

    public cachorro(String especie, Double peso, String race) {
        super(especie, peso);
        setRace(race);
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    public void setRace(String race) {
        this.race = race;
    }
}
