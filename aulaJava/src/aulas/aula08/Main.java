package aulas.aula08;

public class Main {
    public static void main(String[] args) {

        System.out.println("Veículo - Carro:");
        aulas.aula08.Carro carro01 = new Carro();
        carro01.marca = "Volkswagen";
        carro01.modelo = "Gol";
        carro01.ano = 1998;
        carro01.pass = 5;

        carro01.info();
        carro01.abrirPortaMalas();
        carro01.numPass();

        System.out.println("\nVeículo - Moto:");
        aulas.aula08.Moto moto01 = new Moto();
        moto01.marca = "Honda";
        moto01.modelo = "CG";
        moto01.ano = 2010;
        moto01.rodas = 2;

        moto01.info();
        moto01.consegueEmpinar();
        moto01.numRodas();

        System.out.println("\nVeículo - Caminhão:");
        aulas.aula08.Caminhao caminhao01 = new Caminhao();
        caminhao01.marca = "Volvo";
        caminhao01.modelo = "FH 540";
        caminhao01.ano = 2022;
        caminhao01.quantCarga = 54.5;

        caminhao01.info();
        caminhao01.infoTransCarga();
        caminhao01.infoQuantCarga();
    }
}
