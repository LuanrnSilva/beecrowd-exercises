package exe1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double media = ((a * 3.5) + (b * 7.5))/11;

        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
