package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String vogais = "aeiou";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        Character letra = scanner.next().charAt(0);
        letra = Character.toLowerCase(letra);
        if (vogais.indexOf(letra) != -1) {
            System.out.println(letra + " é uma vogal");
        } else {
            System.out.println(letra + " é uma consoante");
        }
        scanner.close();
    }
}