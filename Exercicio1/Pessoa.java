package Exercicio1;

public class Pessoa {
    private int idade;
    private Double altura;
    private Double peso;

    public Pessoa(int idade, Double altura, Double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int maior50anos() {
        if (idade > 50) {
            return 1;
        }
        return 0;
    }

    public int menos40kg() {
        if (peso < 40) {
            return 1;
        }
        return 0;
    }

    public double alturaPessoa10a20Anos() {
        if (idade >= 10 && idade <= 20) {
            return altura;
        }
        return 0.00;
    }

    public int qtdPessoa10a20Anos() {
        if (idade >= 10 && idade <= 20) {
            return 1;
        }
        return 0;
    }

}
