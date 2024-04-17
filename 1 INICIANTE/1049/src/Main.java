import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String plv1 = sc.next();
        String plv2 = sc.next();
        String plv3 = sc.next();

        if (plv1.equalsIgnoreCase("vertebrado")) {
            if (plv2.equalsIgnoreCase("ave")) {
                if (plv3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else{
                if (plv3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        else {
            if (plv2.equalsIgnoreCase("inseto")) {
                if (plv3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else {
                if (plv3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
 
}