import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();

        int anos = entrada / 365;
        int meses = (entrada % 365) / 30;
        int dias = (entrada % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
 
}