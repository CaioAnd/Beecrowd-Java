import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        double distancia = tempo * velocidade;
        double consumo = distancia / 12;

        System.out.printf("%.3f\n", consumo);
    }
 
}