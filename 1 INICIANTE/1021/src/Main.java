import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int quantidade;
        double valor = scanner.nextDouble();
        double[] notas = { 100, 50, 20, 10, 5, 2};
        double[] moedas = {50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        
        for (double nota : notas) {
            quantidade = (int) (valor / nota);
            System.out.printf( quantidade + " nota(s) de R$ %.2f\n", nota);
            valor = valor % nota;
        }

        System.out.println("MOEDAS:");

        quantidade = (int) (valor / 1);
        System.out.println( quantidade + " moeda(s) de R$ 1.00");

        valor = (valor % 1 ) * 100;

        for (double moeda : moedas) {
            quantidade = (int) (valor / moeda);
            System.out.printf( quantidade + " moeda(s) de R$ %.2f\n", moeda / 100);
            valor = valor % moeda;
        }
    }
 
}