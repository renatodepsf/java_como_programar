package capitulo5;

public class CalculoFatorial {
    public static void main(String[] args) {
        long num = 3, produto = 2;

        for (int i = 2; i < 20; i++) {
            produto = produto * num;
            num++;
        }
        System.out.println(produto);
    }
}
