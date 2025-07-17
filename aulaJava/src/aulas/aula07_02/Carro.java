package aulas.aula07_02;

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
}
