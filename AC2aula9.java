import java.util.Scanner;

public class AC2aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPeso = 0, somaNota = 0;
        double resultado = 0;

        System.out.println("Quantos alunos serão");
        int quantAluno = scanner.nextInt();
        
        for(int j = 1; j <= quantAluno; j++){
            
            System.out.println("Qual o nome do aluno" );
            String nomeAlu = scanner.next();
            System.out.println("Quantas notas vão ser inseridas para o Aluno "+ nomeAlu+"? ");
            
            System.out.println("Insira quantas notas ");
            double quantnotas = scanner.nextDouble();

            if( quantnotas <= 0){
                System.out.println("Invalido. Informe a nota de outro aluno");
            }
            
            for(int i = 1; i <= quantnotas; i++){

                System.out.println("Digite a nota " + i + " do "+nomeAlu);
                double nota = scanner.nextDouble();
                
                System.out.println(" Qual e o Peso da nota " +nomeAlu+ "(em forma decimal)");
                double peso =scanner.nextDouble();
                
                somaPeso += peso;
                somaNota += nota * peso;
                
                resultado = somaNota/ somaPeso;  
                
            }
            System.out.println("Ao final a media do " + nomeAlu + " sera:"+ resultado);
        }
        scanner.close();
    }
}
