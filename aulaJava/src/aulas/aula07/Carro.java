package aulas.aula07;

import java.util.Scanner;

public class Carro {

    String cor;
    String modelo;
    int ano;

    void info(){
        System.out.println("O " + modelo + " tem cor " + cor + " e é do ano de " + ano);

    }

    void uso(){
        int uso = 2025 - ano;
        System.out.println("O " + modelo + " tem " + uso + " anos de uso");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carro carro1 = new Carro();
        System.out.println("Digite a cor do carro: ");
        carro1.cor = scanner.nextLine();
        System.out.println("Digite o modelo do carro: ");
        carro1.modelo = scanner.nextLine();
        System.out.println("Digite o ano do carro: ");
        carro1.ano = scanner.nextInt();

        carro1.info();
        carro1.uso();

    }

}
