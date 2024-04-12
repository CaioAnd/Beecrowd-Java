import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String produto1 = scanner.nextLine();
        String produto2 = scanner.nextLine();
        double total = 0;

        String[] dados1 = produto1.split(" ");
        String[] dados2 = produto2.split(" ");

        total = somaProduto(Integer.parseInt(dados1[1]), Double.parseDouble(dados1[2]), total);
        total = somaProduto(Integer.parseInt(dados2[1]), Double.parseDouble(dados2[2]), total);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

    }

    public static double somaProduto(int quantidade, double valor, double total){
        for (int i = 0; i < quantidade; i++){
            total += valor;
        }

        return total;
    }
 
}