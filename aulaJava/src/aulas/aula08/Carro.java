package aulas.aula08;

public class Carro extends Veiculo {
    boolean portaMalas = true;
    int pass;

    public void abrirPortaMalas(){
        System.out.println("Porta malas no veículo: " + portaMalas);
    }

    public void numPass(){
        System.out.println("Quantidade de passageiros: " + pass);
    }
}
