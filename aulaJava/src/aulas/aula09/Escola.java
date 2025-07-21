package aulas.aula09;

interface ID {
    void mostrarID();
}

abstract class Escola implements ID {
    String nome;
    int ID;
    String genero;
}
