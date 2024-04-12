import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double R = scanner.nextDouble();
        double volume = (4.0 / 3.0) * 3.14159 * (R * R * R);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
 
}