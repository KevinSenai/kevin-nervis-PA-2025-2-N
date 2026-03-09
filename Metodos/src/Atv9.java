import java.util.Scanner;

public class Atv9 {
    public static boolean parImpar(int n){
        if(n % 2 == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Numero: ");
        int n = sc.nextInt();
        System.out.println(parImpar(n));
    }
}
