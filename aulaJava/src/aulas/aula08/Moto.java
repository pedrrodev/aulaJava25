package aulas.aula08;

public class Moto extends Veiculo {
    boolean empinar = true;
    int rodas;

    public void consegueEmpinar(){
        System.out.println("Veículo consegue empinar: " + empinar);
    }

    public void numRodas(){
        System.out.println("Quantidade de rodas: " + rodas);
    }
}
