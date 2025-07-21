package aulas.aula12;

public class Contato {
    private String nome;
    private long celular;
    private String email;

    public Contato(String nome, long celular, String email){
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    public void exibirContato(){
        System.out.println("Nome: " + nome);
        System.out.println("Celular: " + celular);
        System.out.println("Email: " + email + "\n");
    }

}
