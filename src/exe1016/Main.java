package exe1016;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int distancia = scanner.nextInt();
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
    }
}
