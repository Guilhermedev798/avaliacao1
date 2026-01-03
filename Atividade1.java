import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        String raw = sc.nextLine().trim();
        double celsius;
        try {
            celsius = Double.parseDouble(raw.replace(',', '.'));
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Use um número, ex: 25.5");
            sc.close();
            return;
        }

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        double kelvin = celsius + 273.15;

        System.out.println();
        System.out.println("-- Conversão de Temperaturas --");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        sc.close();
    }
}
