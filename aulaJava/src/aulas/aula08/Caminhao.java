package aulas.aula08;

public class Caminhao extends Veiculo {
    boolean transCarga = true;
    double quantCarga;

    public void infoTransCarga(){
        System.out.println("Transporte de carga no veículo: " + transCarga);
    }

    public void infoQuantCarga(){
        System.out.println("Quantidade de carga suportada: " + quantCarga + " toneladas");
    }
}
