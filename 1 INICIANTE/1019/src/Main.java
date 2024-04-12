import java.io.IOException;
import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();

        int segundos = entrada % 60;
        int minutos = (entrada / 60) % 60;
        int horas = (entrada / 60) / 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
 
}