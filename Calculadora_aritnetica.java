
import java.util.Scanner;

// CALCULE AS 4 OPERAÇÕES BÁSICAS DA MATEMÁTICA, SEMPRE PASSANDO DOIS VALORES.


public class Calculadora_aritnetica {

    // METÓDO CALCULA SOMA

    public static Double soma(double num1, double num2) {

        double resultado = num1 + num2;
        return resultado;

    }

    // MÉTODO CALCULA SUBTRAÇÃO
    public static Double subtracao(double num1, double num2) {

        double resultado = num1 - num2;
        return resultado;

    }

    // MÉTODO CALCULA MULTIPLICAÇÃO

    public static Double multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    // MÉTODO CALCULA DIVISÃO
    public static Double divisao(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;

    }

    public static void operacoes() {
    	
        Scanner valor = new Scanner(System.in);

        System.out.println("-- VALOR 1 --  ");
        double num1 = valor.nextDouble();

        System.out.println("INDIQUE O OPERADOR: (+) -- (-) -- (*) -- (/)");
        String operador = valor.next();

        System.out.println("-- VALOR 2 -- ");
        double num2 = valor.nextDouble();

        if (operador.equalsIgnoreCase("+")) {
            double res = soma(num1, num2);
            System.out.println("O resultado é = " + res);
        } else if (operador.equalsIgnoreCase("-")) {
            double res = subtracao(num1, num2);
            System.out.println("O resultado é = " + res);
        } else if (operador.equalsIgnoreCase("*")) {
            double res = multiplicacao(num1, num2);
            System.out.println("O resultado é = " + res);
        } else {
            if (operador.equalsIgnoreCase("/")) {
                double res = divisao(num1, num2);
                System.out.println("O resultado é = " + res);
            }
        }
        
       
        valor.close();


    }

    public static void main(String[] args) {
        operacoes();
    }

}
