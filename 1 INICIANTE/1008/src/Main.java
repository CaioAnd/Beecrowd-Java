import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int id = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n", (horas * valor));
    }
 
}