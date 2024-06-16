import java.util.Scanner;
public class Escolha {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Escolha uma opção: ");
    String opcao = scanner.nextLine();

    switch (opcao) {
        case "coca cola":
                 System.out.println("Escolhido: coca cola");
            break;
        case "agua":
                    System.out.println("Escolhido: agua");  
            break;
            case "cafe ":
            System.out.println("Escolhido: cafe");  
            break;
            case "suco ":
            System.out.println("Escolhido: suco");  
            break;
        default: System.out.println("invalido");
            break;
    }
scanner.close();
   } 
}
