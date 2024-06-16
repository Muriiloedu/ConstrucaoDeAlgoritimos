import java.util.Scanner;

public class AC2aula8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPeso = 0, somaNota = 0;

        System.out.println("Quantas notas serão?");
        int quantnotas = scanner.nextInt();
        double resultado = 0;
        for(int i = 1; i <= quantnotas; i++){
            System.out.println("Digite a nota "+i);
            double nota = scanner.nextDouble();

            System.out.println(" Qual e o Peso da nota " +i+ "(em forma decimal)");
            double peso =scanner.nextDouble();

            if(peso < 0 || peso > 100){
                System.out.println("Peso Invalido");
            }
            
            somaPeso += peso;
            somaNota += nota * peso;
            
            resultado = somaNota/ somaPeso;  
        }
        
        System.out.println("Ao final sua media sera:"+ resultado);
        scanner.close();
    }
}