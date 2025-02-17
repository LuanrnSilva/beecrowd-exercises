package exe1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double km = scanner.nextDouble();
        double litros = scanner.nextDouble();
        double resultado = km/litros; 

        System.out.println(String.format("%.3f", resultado) + " km/l");
    }
}
