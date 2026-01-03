import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        for (int i = 0; i < 8; i++) {
            while (true) {
                System.out.print("Digite a nota " + (i + 1) + " (0-10): ");
                String raw = sc.nextLine().trim();
                double nota;
                try {
                    nota = Double.parseDouble(raw.replace(',', '.'));
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número válido.");
                    continue;
                }
                if (nota < 0 || nota > 10) {
                    System.out.println("Valor fora do intervalo. Informe 0 a 10.");
                    continue;
                }
                notas[i] = nota;
                break;
            }
        }

        double b1 = (notas[0] + notas[1]) / 2.0;
        double b2 = (notas[2] + notas[3]) / 2.0;
        double b3 = (notas[4] + notas[5]) / 2.0;
        double b4 = (notas[6] + notas[7]) / 2.0;

        double s1 = (b1 + b2) / 2.0;
        double s2 = (b3 + b4) / 2.0;
        double mediaFinal = (s1 + s2) / 2.0;

        System.out.println();
        System.out.println("--- Resultados ---");
        System.out.printf("1º Bimestre: %.2f%n", b1);
        System.out.printf("2º Bimestre: %.2f%n", b2);
        System.out.printf("1º Semestre: %.2f%n", s1);
        System.out.println("-------------------");
        System.out.printf("3º Bimestre: %.2f%n", b3);
        System.out.printf("4º Bimestre: %.2f%n", b4);
        System.out.printf("2º Semestre: %.2f%n", s2);
        System.out.println("-------------------");
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        sc.close();
    }
}
