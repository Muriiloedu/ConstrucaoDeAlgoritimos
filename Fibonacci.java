import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do número a ser verificado
        System.out.println("Informe um número:");
        int number = scanner.nextInt();
        
        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        
        if (num == 0 || num == 1) {
            return true;
        }

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == num;
    }
}
