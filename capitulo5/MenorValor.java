package capitulo5;

import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 100;

        System.out.print("Enter counter: ");
        int count = input.nextInt();
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value: ");
            values[i] = input.nextInt();
        }

        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Lower value: " + min);
    }
}
