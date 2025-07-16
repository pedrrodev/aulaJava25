package Aulas;

public class Aula02 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        //Operadores aritméticos
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //Comparação
        System.out.println("a > b? " + (a > b)); //true
        System.out.println("a == b? " + (a == b)); //false

        //Lógicos
        boolean condicao1 = (a > 8);
        boolean condicao2 = (b < 3);
        System.out.println("condicao1 && condicao2: " + (condicao1 && condicao2));
        System.out.println("condicao1 || condicao2: " + (condicao1 || condicao2));
        System.out.println("!condicao1: " + (!condicao1));



    }
}
