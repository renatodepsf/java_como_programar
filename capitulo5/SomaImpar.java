package capitulo5;

public class SomaImpar {
    public static void main(String[] args) {
        int sum = 0, count;

        for (count = 1; count < 100; count++) {
            sum += (count + 2);
        }
        sum++;
        System.out.println(sum);
    }
}
