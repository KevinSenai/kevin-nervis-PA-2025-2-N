import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private List<VendaFlor> HistoricoVendas = new ArrayList<>();

    public List<VendaFlor> Historico(){
        return HistoricoVendas;
    }
    public void addVenda(VendaFlor venda){
        HistoricoVendas.add(venda);
    }

    public List<VendaFlor> BuscarFlores(String nomeCliente){
        List<VendaFlor> floresCliente = new ArrayList<>();

        for (VendaFlor venda : HistoricoVendas){
            if (venda.getNomeCliente().equalsIgnoreCase(nomeCliente)){
                floresCliente.add(venda);
            }

        }
        return floresCliente;
    }
}
