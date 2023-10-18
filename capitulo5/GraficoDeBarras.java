package capitulo5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GraficoDeBarras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite 5 vezes numeros de 1 a 30");
            int n = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
            int n4 = entrada.nextInt();
            int n5 = entrada.nextInt();

            if (n <= 30 && n2 <= 30 && n3 <= 30 && n4 <= 30 && n5 <= 30) {

                System.out.println("Gráficos de barras:");
                imprimirGraficosDeBarras(n, n2);

                imprimirGraficosDeBarras(n3, n4);

                for (int i = 0; i < n5; i++) {
                    System.out.print("*");
                }
            }
            System.out.println("Erro. Você digitou algum valor maior que 30");
        } catch (InputMismatchException e) {
            System.out.println("Erro. Você digitou algum valor não numérico");
            e.printStackTrace();
        }
    }

    private static void imprimirGraficosDeBarras(int n3, int n4) {
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
