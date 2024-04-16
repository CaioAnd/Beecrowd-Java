import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cdg = sc.nextInt();
        int qnt = sc.nextInt();
        double total = 0;

        switch (cdg) {
            case 1:
                total = 4.0 * qnt;
                break;

            case 2:
                total = 4.5 * qnt;
                break;

            case 3:
                total = 5.0 * qnt;
                break;

            case 4:
                total = 2.0 * qnt;
                break;
        
            default:
                total = 1.5 * qnt;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
 
}