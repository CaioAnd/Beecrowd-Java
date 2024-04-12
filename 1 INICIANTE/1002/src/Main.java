import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define o local para inglês (EUA)
        
        double n = 3.14159;
        double raio = scanner.nextDouble();
        double area = n * (raio * raio);

        System.out.printf("A=%.4f\n", area);
        
    }
 
}