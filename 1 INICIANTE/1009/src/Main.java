import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String nome = scanner.next();               
        double salarioFixo = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", (salarioFixo + ( vendas * 0.15)));
    }
 
}