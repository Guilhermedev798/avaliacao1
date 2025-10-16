import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        // Conversão das temperaturas
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        double kelvin = celsius + 273.15;

        // Exibição dos resultados formatados
        System.out.println("\n-- Conversão de Temperaturas --");
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2fK%n", kelvin);

        sc.close();
    }
}
