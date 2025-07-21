package aulas.aula09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola escola = new Escola() {
            @Override
            public void mostrarID() {

            }
        };

        System.out.println("Digite [1] para professor ou [2] para aluno: ");

        int escolha = scanner.nextInt();
        switch (escolha) {

            case 1:
                Professor professor1 = new Professor();

                System.out.println("Digite o seu nome: ");
                escola.nome = scanner.next();

                System.out.println("Digite o ID: ");
                escola.ID = scanner.nextInt();

                System.out.println("Digite o seu sexo: ");
                escola.genero = scanner.next();

                System.out.println("Digite a matéria: ");
                professor1.materia = scanner.next();

                professor1.mostrarMateria();

                break;

            case 2:
                Aluno aluno = new Aluno();

                System.out.println("Digite o seu nome: ");
                escola.nome = scanner.next();

                System.out.println("Digite o ID: ");
                escola.ID = scanner.nextInt();

                System.out.println("Digite o seu sexo: ");
                escola.genero = scanner.next();

                System.out.println("Digite a sala: ");
                aluno.sala = scanner.nextInt();

                System.out.println("Digite o turno: ");
                aluno.turno = scanner.next();

                aluno.mostrarSala();
                aluno.mostrarTurno();

                break;

            default:
                System.out.println("Opção incorreta!");
        }
    }
}
