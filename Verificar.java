import java.util.Scanner;

public class ComA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada da string
        System.out.println("Informe uma string:");
        String input = scanner.nextLine();
        
        // Verifica a quantidade de letras 'a' e 'A'
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        
        System.out.println("A letra 'a' aparece " + count + " vezes.");
        
        scanner.close();
    }
}
