package exe1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;
        double raio = scanner.nextDouble();
        Double area = (n * Math.pow(raio, 2));
        String result = String.format("A=%.4f", area);
        System.out.println(result);
    }
}
