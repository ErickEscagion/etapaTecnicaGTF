package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        int idade, qtdPessoas = 3, maior50anos = 0, menos40kg = 0, qtdPessoa10a20Anos = 0;
        Double altura, peso, mediaMenos40kg = 0.00, totalAlturaPessoa10a20Anos = 0.00, mediaAlturas = 0.00;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Digite a idade da pessoa" + i + ":");
            idade = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite a altura da pessoa" + i + ":");
            altura = Double.parseDouble(scanner.nextLine());
            System.out.println("Digite o peso da pessoa" + i + ":");
            peso = Double.parseDouble(scanner.nextLine());
            pessoas.add(new Pessoa(idade, altura, peso));
        }

        for (int i = 0; i < qtdPessoas; i++) {
            maior50anos += pessoas.get(i).maior50anos();
            menos40kg += pessoas.get(i).menos40kg();
            totalAlturaPessoa10a20Anos += pessoas.get(i).alturaPessoa10a20Anos();
            qtdPessoa10a20Anos += pessoas.get(i).qtdPessoa10a20Anos();
        }

        if (menos40kg != 0) {
            mediaMenos40kg = (((double) menos40kg / (double) qtdPessoas) * 100);

        }
        if (qtdPessoa10a20Anos != 0) {
            mediaAlturas = totalAlturaPessoa10a20Anos / qtdPessoa10a20Anos;
        }

        System.out.println("A quantidade de pessoas com mais de 50 anos é: " + maior50anos);
        System.out.println("A porcentagem das pessoas com menos de 40KG é: " + mediaMenos40kg);
        System.out.println("A media das alturas das pessoas entre 10 e 20 anos é: " + mediaAlturas);
        scanner.close();
    }
}