package exe1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double result = (salarioFixo + (0.15 * totalVendas));

        System.out.println(String.format("TOTAL = R$ %.2f", result));
    }
}
