import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        System.out.printf("%.3f km/l\n", X/Y);
    }
 
}