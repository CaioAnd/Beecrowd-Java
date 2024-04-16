import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.printf("Perimetro = %.1f\n", A + B + C);
        }
        else {
            System.out.printf("Area = %.1f\n", ((A + B) * C) / 2);
        }

        sc.close();
    }
 
}