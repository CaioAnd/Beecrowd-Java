import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int quantidade;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int nota : notas) {
            quantidade = valor / nota;
            valor = valor % nota;
            System.out.println(quantidade + " nota(s) de R$ "+ nota +",00");
        }
    }
 
}