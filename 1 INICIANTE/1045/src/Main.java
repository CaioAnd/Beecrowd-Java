import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();

        double A, B, C;

        //Organizando valores
        if (val1 >= val2 && val1 >= val3) {
            if (val2 >= val3) {
                A = val1;
                B = val2;
                C = val3;
            }
            else {
                A = val1;
                B = val3;
                C = val2;
            }
        }
        else if (val2 >= val1 && val2 >= val3){
            if (val1 >= val3) {
                A = val2;
                B = val1;
                C = val3;
            }
            else {
                A = val2;
                B = val3;
                C = val1;
            }
        }
        else {
            if (val2 >= val1) {
                A = val3;
                B = val2;
                C = val1;
            }
            else {
                A = val3;
                B = val3;
                C = val1;
            }
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{

            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if (A == B ^ C == B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
 
}