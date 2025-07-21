package aulas.aula10;


public class Main {
    public static void main(String[] args) {
            //
            Pessoa p1 = new Pessoa();
            p1.setNome("ana");
            p1.setIdade(25);
            p1.setRg(123456789);
            p1.setCpf(12345678910L);

            //
            Pessoa p2= new Pessoa();
            p2.setNome("Minoru");
            p2.setIdade(25);
            p2.setRg(98765432);
            p2.setCpf(10987654321L);
            //
            Pessoa p3 = new Pessoa();
            p3.setNome("Roberto");
            p3.setIdade(50);
            p3.setRg(741852963);
            p3.setCpf(14725836914L);
            //
            Pessoa p4 = new Pessoa();
            p4.setNome("Helen");
            p4.setIdade(17);
            p4.setRg(963852741);
            p4.setCpf(963852741968L);
            //
            System.out.println("\nPessoa 01:");
            System.out.println("Nome: " + p1.getNome());
            System.out.println("Idade: " + p1.getIdade());
            System.out.println("RG: " + p1.getRg());
            System.out.println("CPF: " + p1.getCpf());
            //
            System.out.println("\nPessoa 02:");
            System.out.println("Nome: " + p2.getNome());
            System.out.println("Idade: " + p2.getIdade());
            System.out.println("RG: " + p2.getRg());
            System.out.println("CPF: " + p1.getCpf());
            //
            System.out.println("\nPessoa 03:");
            System.out.println("Nome: " + p3.getNome());
            System.out.println("Idade: " + p3.getIdade());
            System.out.println("RG: " + p3.getRg());
            System.out.println("CPF: " + p1.getCpf());
            //
            System.out.println("\nPessoa 04:");
            System.out.println("Nome: " + p4.getNome());
            System.out.println("Idade: " + p4.getIdade());
            System.out.println("RG: " + p4.getRg());
            System.out.println("CPF: " + p4.getCpf());
        }
    }

