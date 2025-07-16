package Aulas;

public class Aula04 {

    public static void main(String[] args) {

        int base = 2;
        int expoente = 3;

        System.out.println("1. Potenciação:");
        System.out.println(base + " elevado à " + expoente + " é: " + Math.pow(base, expoente));

        int negativo = -10;
        System.out.println("\n2. Valor absoluto:");
        System.out.println("O valor absoluto de " + negativo + " é: " + Math.abs(negativo));

        int a = 7, b = 15;
        System.out.println("\n3. Maior valor:");
        System.out.println("O maior entre " + a + " e " + b + " é: " + Math.max(a, b));

        System.out.println("\n4. Menor valor:");
        System.out.println("O menor entre " + a + " e " + b + " é: " + Math.min(a, b));

        double valor = 3.5;
        System.out.println("\n5. Arredondamento:");
        System.out.println("Arredondando " + valor + ": " + Math.round(valor));

        System.out.println("\n6. Número aleatório real:");
        double aleatorio = Math.random() * 100;
        System.out.println("Número aleatório real entre 0 e 100: " + String.format("%.2f", aleatorio));
        System.out.println("Número aleatório real arredondado: " + Math.round(aleatorio));


        System.out.println("\n7. Número aleatório inteiro:");
        System.out.println("Número aleatório inteiro entre 0 e 100: " + Math.round(Math.random()*100));

        System.out.println("\n8. Raiz quadrada:");
        System.out.println("A raiz quadrada de 144 é: " + Math.sqrt(144));

    }

}
