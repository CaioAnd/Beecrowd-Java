import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int valor = 0;

        for (int i = 0; i < 6; i++) {
            double x = sc.nextDouble();
            if (x > 0) {
                valor++;
            }
        }

        System.out.println(valor + " valores positivos");

        sc.close();
    }
 
}