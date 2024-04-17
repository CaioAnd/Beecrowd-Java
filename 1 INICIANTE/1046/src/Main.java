import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int tempo;

        if (fim > inicio) {
            tempo = fim - inicio;
        }
        else {
            tempo = fim - inicio + 24;
        }

        System.out.println("O JOGO DUROU "+ tempo +" HORA(S)");

        sc.close();
    }
 
}