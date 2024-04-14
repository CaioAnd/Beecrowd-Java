import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        scanner.nextLine(); //Consome quebra de linha deixada pelo nextInt();
        
        for (int i = 0; i <= quantidade; i++) {
            String dados = scanner.nextLine();
            char operador = dados.charAt(6);
            
            switch (operador) {
                case '+':
                    
                    break;

                case '-':
                    
                    break;
            
                case '*':
                    
                    break;

                case '/':
                    
                    break;
            }
        }

        scanner.close();
    }
}