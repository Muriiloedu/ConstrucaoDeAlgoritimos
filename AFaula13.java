import java.util.Scanner;

public class AFaula13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantAlunos = 0;

        System.out.print("Quantos alunos Serão: ");
        quantAlunos = scanner.nextInt();

        String[] nomes = new String[quantAlunos];
        double[][] notas = new double[quantAlunos][quantAlunos];
        double[][] pesos = new double[quantAlunos][quantAlunos]; 
        double[] medias = new double[quantAlunos];

        for (int i = 0; i < quantAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Digite a quantidade de notas do aluno " + (i + 1) + ": ");
            int numeroDeNotas = scanner.nextInt();

            notas[i] = new double[numeroDeNotas];
            pesos[i] = new double[numeroDeNotas]; 

            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < numeroDeNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                System.out.print("Peso da nota " + (j + 1) + ": ");
                pesos[i][j] = scanner.nextDouble(); 
            }
        }

        
        for (int i = 0; i < quantAlunos; i++) {
            double somaPonderada = 0;
            double somaPesos = 0;

            for (int j = 0; j < notas[i].length; j++) {
                somaPonderada += notas[i][j] * pesos[i][j]; 
                somaPesos += pesos[i][j]; 
            }
            medias[i] = somaPonderada / somaPesos; 
        }

        while (true) {
            
            for (int i = 0; i < quantAlunos; i++) {
                System.out.print("Deseja Consultar algum Aluno? (sim/nao): ");
                String resposta = scanner.next();
    
               
                    switch (resposta) {
                        case "sim":
                            System.out.println("Qual aluno?");
                            nomes[i] = scanner.next();
                           
                            System.out.println("A média do aluno " + nomes[i] + " é: " + medias[i]);
                        
                            break;
                        
                        case "nao":
                            scanner.close();
                            System.out.println("Fim do Programa");
                            return;
                        default:
                                System.out.println("Resposta invalida. Digite sim ou nao");
                        break;
                    }
                
            }
        }
    }
}
