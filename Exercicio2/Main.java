package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite a primeira letra: ");
        Character primeiraLetra = Character.toLowerCase(scanner.next().charAt(0));
        System.out.println("Digite a segunda letra: ");
        Character segundaLetra = Character.toLowerCase(scanner.next().charAt(0));

        if (primeiraLetra > segundaLetra) {
            System.out.println("'" + primeiraLetra + "', '" + segundaLetra + "' = Não está na ordem alfabética");
        } else {
            Character bkpPrimeiraLetra = primeiraLetra;
            while (primeiraLetra != segundaLetra) {
                primeiraLetra++;
                cont++;
            }
            System.out.println("'" + bkpPrimeiraLetra + "', '" + segundaLetra + "' = " + (cont - 1));
        }
        scanner.close();
    }
}