package aulas.aula12;

public class Contato {
    //Atributos privados (encapsulamento)
    private String nome;
    private long celular;
    private String email;

    //Construtor
    public Contato(String nome, long celular, String email){
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }
    //Metodo para exibir dados
    public void exibirContato(){
        System.out.println("Nome: " + nome);
        System.out.println("Celular: " + celular);
        System.out.println("Email: " + email + "\n");
    }
    //Setter para nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //Getter para nome
    public String getNome(){
        return nome;
    }
    //Setter para celular
    public void setCelular(long celular) {
        this.celular = celular;
    }
    //Getter para celular
    public long getCelular(){
        return celular;
    }
    //Setter para email
    public void setEmail(String email){
        this.email = email;
    }
    //Getter para email
    public String getEmail(String email){
        return email;
    }
}


