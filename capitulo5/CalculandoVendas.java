package capitulo5;

import java.util.Scanner;

public class CalculandoVendas {
    public static void main(String[] args) {
        //  produto 1, US$ 2,98
        //  produto 2, US$ 4,50
        //  produto 3, US$ 9,98
        //  produto 4, US$ 4,49
        //  produto 5, US$ 6,87

        Scanner entrada = new Scanner(System.in);
        int produto = 0, qtd = 0;
        double valorTotal = 0.0, valor = 0.0;

        do {
            System.out.print("Digite o numero do produto: ");
            produto = entrada.nextInt();
            System.out.print("Digite a quantidade vendida: ");
            qtd = entrada.nextInt();

            switch (produto) {
                case 1:
                    valor = qtd * 2.98;
                    break;
                case 2:
                    valor = qtd * 4.50;
                    break;
                case 3:
                    valor = qtd * 9.98;
                    break;
                case 4:
                    valor = qtd * 4.49;
                    break;
                case 5:
                    valor = qtd * 6.87;
                    break;
            }
            valorTotal += valor;
        } while (produto >= 1 && produto <= 5);
        System.out.println("Produto ("+ produto +") nao cadastrado");
        System.out.println("Valor total dos produtos: " + valorTotal);
    }
}
