package exe1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double resultado = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", resultado));
    }
}
