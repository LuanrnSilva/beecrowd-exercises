package exe1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int r = scanner.nextInt();
        double pi = 3.14159;
        double result = (4.0/3) * pi * Math.pow(r, 3);
        System.out.println(String.format("VOLUME = %.3f", result));
    }
}
