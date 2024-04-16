import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // Definindo o padrão de formatação para uma casa decimal
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println("Media: " + df.format(media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 7 && media >= 5) {

            System.out.println("Aluno em exame.");

            double exame = sc.nextDouble();

            System.out.println("Nota do exame: " + df.format(exame));

            double mediaFinal = (exame + media) / 2;

            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format((exame + media) / 2));
        }
        else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
 
}