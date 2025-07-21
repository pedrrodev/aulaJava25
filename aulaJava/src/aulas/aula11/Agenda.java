package aulas.aula11;

public class Agenda {
    private String nome;
    private long celular;
    private String email;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCelular(long celular){
        this.celular = celular;
    }

    public long getCelular() {
        return celular;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
