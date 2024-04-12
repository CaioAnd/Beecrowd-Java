import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String entrada1 = scanner.nextLine();
        String entrada2 = scanner.nextLine();

        String[] dados1 = entrada1.split(" ");
        String[] dados2 = entrada2.split(" ");

        double X1 = Double.parseDouble(dados1[0]);
        double Y1 = Double.parseDouble(dados1[1]);
        double X2 = Double.parseDouble(dados2[0]);
        double Y2 = Double.parseDouble(dados2[1]);

        System.out.printf("%.4f\n", Math.sqrt( Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2)));
    }
 
}