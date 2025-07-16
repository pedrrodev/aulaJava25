package Aulas;

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.print("Digite a nota do 1º semestre: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a nota do 2º semestre: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a nota do 3º semestre: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite a nota do 4º semestre: ");
        double n4 = scanner.nextDouble();
        System.out.print("Digite a nota do 5º semestre: ");
        double n5 = scanner.nextDouble();
        System.out.print("Digite a nota do 6º semestre: ");
        double n6 = scanner.nextDouble();
        System.out.print("Digite a nota do 7º semestre: ");
        double n7 = scanner.nextDouble();
        System.out.print("Digite a nota do 8º semestre: ");
        double n8 = scanner.nextDouble();
        System.out.print("Digite a nota do 9º semestre: ");
        double n9 = scanner.nextDouble();
        System.out.print("Digite a nota do 10º semestre: ");
        double n10 = scanner.nextDouble();
        double media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n7 + n8 + n9 + n10) / 10;
        System.out.println("A sua média durante os 10 semestres foi de: " + media);
        if (media >= 6) {
            System.out.println("Parabéns, você está aprovado!");
        } else {
            System.out.println("Que pena, você está reprovado!");
        }

    }
}
