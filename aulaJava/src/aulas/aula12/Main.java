package aulas.aula12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("João", 119999912341L, "joao@joao.com.br");
        contato1.exibirContato();

        Contato contato2 = new Contato("Maria", 11912349999L, "maria@maria.com.br");
        contato2.exibirContato();
    }
}
