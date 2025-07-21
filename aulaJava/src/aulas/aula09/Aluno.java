package aulas.aula09;

public class Aluno extends Escola {
    String turno;
    int sala;

    @Override
    public void mostrarID() {
        System.out.println("Sua ID de aluno é " + ID);
    }

    public void mostrarTurno(){
        System.out.println("Seu turno é " + turno);
    }

    public void mostrarSala(){
        System.out.println("Sua sala é " + sala);
    }
}
