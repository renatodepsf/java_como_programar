package capitulo5;

public class ProdutoDosImpares {

    public static void main(String[] args) {
        int x = 1, produto = 0;

        for(int i = 1; x <= 15; i++) {
            produto += (x * (x + 2));
            x += 2;
        }

        System.out.println("O produto dos número inteiros ímpares é " + produto);
    }
}
