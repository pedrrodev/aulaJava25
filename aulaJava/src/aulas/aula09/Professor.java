package aulas.aula09;

public class Professor extends Escola {
    String materia;

    @Override
    public void mostrarID(){
        System.out.println("Sua ID de professor é " + ID);
    }

    public void mostrarMateria(){
        System.out.println("Sua matéria é " + materia);
    }
}
