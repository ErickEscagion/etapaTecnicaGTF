package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] cedulasMoedas = new Double[] { 100.00, 50.00, 10.00, 5.00, 1.00, 0.50, 0.10, 0.05, 0.01 };
        Double valorTotal, valorPago, troco;
        int aux = 0, cont = 0;

        System.out.println("Digite o valor total a ser pago:");
        valorTotal = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o valor efetivamente pago:");
        valorPago = Double.parseDouble(scanner.nextLine());
        troco = valorPago - valorTotal;

        if (troco < 0) {
            System.out.println("Falta ser pago RS" + (troco * -1) + " Logo não há troco!");
        } else if (troco == 0) {
            System.out.println("Valor pago igual ao valor do pedido RS" + valorTotal + " Logo não há troco!");
        } else {
            for (int i = 0; i < cedulasMoedas.length; i++) {
                if (troco > cedulasMoedas[i]) {
                    aux = (int) (troco / cedulasMoedas[i]);
                    cont += aux;
                    troco -= cedulasMoedas[i] * aux;
                    System.out.println(aux + " de RS:" + cedulasMoedas[i]);
                }
            }
            System.out.println("Logo o menor numero de celulas e moedas possiveis é:" + cont);
        }
        scanner.close();
    }
}