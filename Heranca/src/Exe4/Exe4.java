package Exe4;

public class Exe4 {
    public static void main(String[] args) {
        Computador c = new Computador("Dell",false);
        System.out.println(c.obterStatus());

        Notebook n = new Notebook("Dell",10,true);
        System.out.println(n.obterStatus());
    }
}
