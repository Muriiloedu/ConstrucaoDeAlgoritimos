import java.util.Scanner;

public class Ac2aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e a nota minima:");
        int notaMin = scanner.nextInt();

        System.out.println("Qual foi sua nota:");
        double notaAlu = scanner.nextInt();

        if(notaAlu >= notaMin){
            System.out.println("Voce Passou");
        }else{
            System.out.println("Voce nao passou");
        }
        scanner.close();
    }    
}