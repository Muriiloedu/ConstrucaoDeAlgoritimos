import java.util.Scanner;

public class AC2aula7 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e a sua media final:");
        int media = scanner.nextInt(); 
        
       if(media >=0 && media<=2){
            System.out.println("Aluno Reprovado");
       } else if( media >= 2.1 && media <= 4.9){
            System.out.println("O aluno precisa fazer Substitutiva");
       } else if( media >= 5 && media <=10){
            System.out.println("Aluno Aprovado");
       } else {
             System.out.println("Nota invalida");  
       }
        scanner.close();
    }
}