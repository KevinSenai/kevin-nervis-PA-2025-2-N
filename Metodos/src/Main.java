import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        estadoEpoca();
    }

    public static void estadoEpoca() {
        System.out.println("Informe a Enstão \n1 - Primavera\n2 - Verão \n3 - Outono \n4 - Inverno");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("As Flores estão Abrochando");
                break;
            case 2:
                System.out.println("É Verão bora praia");
                break;
            case 3:
                System.out.println("Flor Cainda Bem vindo ao Outono");
                break;
            case 4:
                System.out.println("Esta Frio la fora, Bem vindo ao Inverno");
                break;
            default:
                System.out.println("Numero Invalido!!");
        }
    }
    public static void amigos(){

    }
}

