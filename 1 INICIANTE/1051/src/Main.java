import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double slr = sc.nextDouble();

        if (slr <= 2000) {
            System.out.println("Isento");
        }
        else if (slr > 2000 && slr <= 3000) {
            System.out.printf("R$ %.2f\n", (slr - 2000) * 0.08);
        }
        else if (slr > 3000 && slr <= 4500) {
            System.out.printf("R$ %.2f\n", (slr - 3000) * 0.18 + 1000 * 0.08);
        }
        else {
            System.out.printf("R$ %.2f\n", (slr - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08);
        }

        sc.close();
    }
 
}