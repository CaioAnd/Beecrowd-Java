import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] dados = entrada.split(" ");
        int A = Integer.parseInt(dados[0]);
        int B = Integer.parseInt(dados[1]);
        int C = Integer.parseInt(dados[2]);

        int valorMaior = calculaMaiorValor(A,B);
        valorMaior = calculaMaiorValor(valorMaior, C);

        System.out.println(valorMaior + " eh o maior");
    }

    public static int calculaMaiorValor(int A, int B) {
        return (A+B+Math.abs(A-B))/2;
    }
 
}