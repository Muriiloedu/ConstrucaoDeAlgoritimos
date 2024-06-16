import java.util.Scanner;

public class Positivo_negativo {
    
    public static void main(String[] args) {
        int numero;
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual o numero:");
        numero = scn.nextInt();

        if (numero >=1){
            System.out.println("Numero e positivo");
        } else if (numero == 0) {
            System.out.println("numero e zero");
        } else{
            System.out.println("Numero Negativo");
            scn.close();
        }
    }
}
