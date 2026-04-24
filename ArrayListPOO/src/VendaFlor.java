public class VendaFlor {
    private String NomeFlor;
    private double PrecoFlor;
    private String NomeCliente;

    @Override
    public String toString() {
        return "Flor: " + NomeFlor + " | Preço: R$" + PrecoFlor + " | Cliente: " + NomeCliente;
    }

    public VendaFlor(String nomeFlor, double precoFlor, String nomeCliente) {
        setNomeFlor(nomeFlor);
        setNomeCliente(nomeCliente);
        setPrecoFlor(precoFlor);
    }

    public void setNomeFlor(String nomeFlor) {
        if (NomeFlor == null ){
            new IllegalAccessError("Nome Invalido");
        }
        NomeFlor = nomeFlor;
    }

    public void setPrecoFlor(double precoFlor) {
        if (PrecoFlor <= 0 ){
            new IllegalAccessError("Nome Invalido");
        }
        PrecoFlor = precoFlor;
    }

    public void setNomeCliente(String nomeCliente) {
        if (NomeCliente == null ){
            new IllegalAccessError("Nome Invalido");
        }
        NomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

}
