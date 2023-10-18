package capitulo5;

public class ImpressaoDeTriangulos {
    public static void main(String[] args) {

        int cont = 10, k = 1;

        // letra a
        for(int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // letra b
        for (int i = 10; i > 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // letra c
        for(int i = 1; i <= 10; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (k = 1; k < cont; k++) {
                System.out.print("*");
            }
            cont--;
            System.out.println();
        }

        System.out.println();

        // letra d
        for(int i = 1; i <= 10; i++) {
                for (k = 1; k < cont; k++) {
                    System.out.print(" ");
                }
                for (int l = 0; l < i; l++) {
                    System.out.print("*");
                }
                cont--;
            System.out.println();
        }
    }
}
