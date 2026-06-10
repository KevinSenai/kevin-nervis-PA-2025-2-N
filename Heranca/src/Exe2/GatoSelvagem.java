package Exe2;

public class GatoSelvagem extends Animal{
    private String corPelagem;
    private String tipoMancha;

    public GatoSelvagem(String raca, String nome, String porte, String habitat, String paisOrigem, String corPelagem, String tipoMancha) {
        super(raca, nome, porte, habitat, paisOrigem);
        setCorPelagem(corPelagem);
        setTipoMancha(tipoMancha);
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public void setTipoMancha(String tipoMancha) {
        this.tipoMancha = tipoMancha;
    }
}
