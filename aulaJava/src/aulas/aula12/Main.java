package aulas.aula12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //Instanciando contato1
        Contato contato1 = new Contato("João", 119999912341L, "joao@joao.com.br");
        contato1.exibirContato();

        //Instanciando contato2
        Contato contato2 = new Contato("Maria", 11912349999L, "maria@maria.com.br");
        contato2.exibirContato();

        //Solicitando nome do contato3
        System.out.print("Digite o nome: ");
        String nome3 = scanner.nextLine();

        //Solicitando celular do contato3
        Long celular3;
        String celular3Str;
        //Tratamento de dados para celular ter apenas números
        while (true) {
            System.out.print("Digite o celular (apenas números): ");
            celular3Str = scanner.next();
            if(celular3Str.matches("\\d+")){
                celular3 = Long.parseLong(celular3Str);
                break;
            } else{
                System.out.println("Erro: o celular deve conter apenas números!");
            }
        }

        //Solicitando email do contato3
        String email3;
        //Tratamento de dados para email conter @ e i
        while (true){
            System.out.print("Digite o email: ");
            email3 = scanner.next();
            if(email3.contains("@") && email3.contains(".")){
                break;
            } else{
                System.out.println("Erro: email inválido. Deve conter @ e .");
            }
        }

        //Exibindo dados do contato3
        Contato contato3 = new Contato(nome3, celular3, email3);
        contato3.exibirContato();

        //Atualizando nome do contato1
        contato1.setNome("José");
        System.out.println("\nNome do 1º contato atualizado:");
        contato1.exibirContato();

        scanner.close();
    }
}
