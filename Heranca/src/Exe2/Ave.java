package Exe2;

public class Ave extends Animal{
    private String corPena;
    private String tipoAlimentacao;



    public Ave(String raca, String nome, String porte, String habitat, String paisOrigem, String corPena, String tipoAlimentacao) {
        super(raca, nome, porte, habitat, paisOrigem);
        setCorPena(corPena);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
}
