import java.util.ArrayList;
import java.util.List;

public class BdRetangulos {
    private List<Retangulo> listaRetangulos;

    public  BdRetangulos(){
        listaRetangulos = new ArrayList<>();
    }
    public void addRetagunlo(Retangulo r){
        listaRetangulos.add(r);
    }
    public List<Retangulo> Lista(){
        return listaRetangulos;
    }


    public Retangulo MaiorArea(){
        double MaiorA = Double.MIN_VALUE;
        Retangulo retmaiorA = null;

        for (Retangulo r : listaRetangulos){
            if (r.Area() > MaiorA){
                MaiorA = r.Area();
                retmaiorA = r;
            }
        }
        return retmaiorA;
    }
    public Retangulo MaiorPerimetro(){
        double MaiorP = Double.MIN_VALUE;
        Retangulo retMaiorP = null;

        for (Retangulo r : listaRetangulos){
            if (r.Perimetro() > MaiorP){
                MaiorP = r.Perimetro();
                retMaiorP = r;
            }
        }
        return retMaiorP;
    }
}
