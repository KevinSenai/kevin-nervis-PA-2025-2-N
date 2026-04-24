import java.util.List;

public class Exe2Flor {
    public static void main(String[] args) {
        VendaFlor flor1 = new VendaFlor("Tulipa",5.50,"Ronaldo");
        VendaFlor flor2 = new VendaFlor("Rosas",5.50,"Pedro");
        VendaFlor flor3 = new VendaFlor("Tulipa",5.50,"João");


        Floricultura sistema = new Floricultura();
        sistema.addVenda(flor1);
        sistema.addVenda(flor2);
        sistema.addVenda(flor3);

        List<VendaFlor> compraRonaldo = sistema.BuscarFlores("Ronaldo");
        System.out.println(compraRonaldo);

    }
}
