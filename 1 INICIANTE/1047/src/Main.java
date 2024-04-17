import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int hrInc = sc.nextInt();
        int minInc = sc.nextInt();
        int hrFnl = sc.nextInt();
        int minFnl = sc.nextInt();

        int hrs, min;

        hrs = (hrFnl > hrInc) ?  hrFnl - hrInc : hrFnl - hrInc + 24;

        if (minFnl >= minInc) {
            min = minFnl - minInc;
        }
        else {
            hrs--;
            min = minFnl - minInc + 60;
        }

        if (hrs == 24 && min > 0) {
            hrs = 0;
        }

        System.out.println("O JOGO DUROU " + hrs + " HORA(S) E " + min + " MINUTO(S)");
        

        sc.close();
    }
 
}