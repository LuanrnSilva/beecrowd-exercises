package exe1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int funcionario = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();
        double salario = (valorHora * horas);

        System.out.println("NUMBER = " + funcionario);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
