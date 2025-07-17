package aulas.aula05;

public class Aula05 {
    public static void main(String[] args) {
        String nome = "Pedro";
        double s1 = 7.5, s2 = 8.0, s3 = 4.2, s4 = 5.5, s5 = 6.5, s6 = 9.3, s7 = 3.0, s8 = 4.0, s9 = 10.0, s10 = 8.5, media;
        media = (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10) / 10;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota no 1º semestre: " + s1);
        System.out.println("Nota no 2º semestre: " + s2);
        System.out.println("Nota no 3º semestre: " + s3);
        System.out.println("Nota no 4º semestre: " + s4);
        System.out.println("Nota no 5º semestre: " + s5);
        System.out.println("Nota no 6º semestre: " + s6);
        System.out.println("Nota no 7º semestre: " + s7);
        System.out.println("Nota no 8º semestre: " + s8);
        System.out.println("Nota no 9º semestre: " + s9);
        System.out.println("Nota no 10º semestre: " + s10);
        System.out.println("A média de " + nome + " durante os 10 semestres foi de " + media);

    }
}
