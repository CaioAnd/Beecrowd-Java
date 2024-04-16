import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int maior, medio, menor;

        //Descobrindo maior valor
        if (val1 > val2) {
            if (val1 > val3) {
                maior = val1;
            }
            else {
                maior = val3;
            }
        }
        else if (val2 > val3) {
            maior = val2;
        }
        else {
            maior = val3;
        }

        //Descobrindo valor medio e menor
        if (maior == val1) {
            if (val2 > val3) {
                medio = val2;
                menor = val3;
            }
            else {
                medio = val3;
                menor = val2;
            }
        }
        else if (maior == val2) {
            if (val1 > val3) {
                medio = val1;
                menor = val3;
            }
            else {
                medio = val3;
                menor = val1;
            }
        }
        else { //caso maior for val3
            if (val2 > val1) {
                medio = val2;
                menor = val1;
            }
            else {
                medio = val1;
                menor = val2;
            }
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior+"\n");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        sc.close();
    }
 
}