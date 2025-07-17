package aulas.aula07_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aulas.aula07_02.Carro carro1 = new Carro();
        System.out.print("Digite a cor do carro: ");
        carro1.cor = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        carro1.modelo = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro1.ano = scanner.nextInt();

        carro1.info();
        carro1.uso();
    }
}
