
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double resultado = 0;

        for (int i = 0; i != 2;  i++) {
            int numero = scanner.nextInt();
            int quantidade = scanner.nextInt();
            double preco = scanner.nextDouble();
            double calculo = (preco * quantidade);
            resultado += calculo;
        }

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", resultado) );
    }
}
