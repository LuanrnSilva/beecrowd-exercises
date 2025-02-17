package exe1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = ((a + b) + Math.abs(a - b))/2;
        int maiorABC = ((maiorAB + c) + Math.abs(maiorAB - c))/2;

        int maior = maiorABC;
        System.out.println(maior + " eh o maior");
    }
}
