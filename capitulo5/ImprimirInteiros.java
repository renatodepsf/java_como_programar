package capitulo5;

public class ImprimirInteiros {
    public static void main(String[] args) {
        int i = 1;

        while (i < 21) {
            System.out.print(i);
            System.out.print('\t');

            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
        System.out.println();

        for (i = 1; i < 21; i++) {
            System.out.print(i);
            System.out.print('\t');

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
