package aulas.aula11;

public class Main {
    public static void main(String[] args) {

        Agenda contato1 = new Agenda();
        contato1.setNome("João");
        contato1.setCelular(11999991234L);
        contato1.setEmail("joao@joao.com.br");

        Agenda contato2 = new Agenda();
        contato2.setNome("Maria");
        contato2.setCelular(11912349999L);
        contato2.setEmail("maria@maria.com.br");

        System.out.println("\nContato 01:");
        System.out.println("Nome: " + contato1.getNome());
        System.out.println("Celular: " + contato1.getCelular());
        System.out.println("Email: " + contato1.getEmail());

        System.out.println("\nContato 02:");
        System.out.println("Nome: " + contato2.getNome());
        System.out.println("Celular: " + contato2.getCelular());
        System.out.println("Email: " + contato2.getEmail());





    }
}
