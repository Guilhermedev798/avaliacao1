import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas[0] + notas[1]) / 2.0;
        double bimestre2 = (notas[2] + notas[3]) / 2.0;
        double bimestre3 = (notas[4] + notas[5]) / 2.0;
        double bimestre4 = (notas[6] + notas[7]) / 2.0;

        // Cálculo das médias semestrais
        double semestre1 = (bimestre1 + bimestre2) / 2.0;
        double semestre2 = (bimestre3 + bimestre4) / 2.0;

        // Cálculo da média final anual
        double mediaFinal = (semestre1 + semestre2) / 2.0;

        // Impressão dos resultados formatados
        System.out.println("\n--- Resultados ---");
        System.out.printf("1º Bimestre: %.2f%n", bimestre1);
        System.out.printf("2º Bimestre: %.2f%n", bimestre2);
        System.out.printf("1º Semestre: %.2f%n", semestre1);
        System.out.println("-------------------");
        System.out.printf("3º Bimestre: %.2f%n", bimestre3);
        System.out.printf("4º Bimestre: %.2f%n", bimestre4);
        System.out.printf("2º Semestre: %.2f%n", semestre2);
        System.out.println("-------------------");
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        sc.close();
    }
}