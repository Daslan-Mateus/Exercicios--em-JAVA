
/*
Desenvolva um programa que calcule a soma de todos os números ́ımpares numa
determinada faixa de números. O usuário deve informar o n umero inicial e o numero final.
*/

import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {
        System.out.println(soma(1, 3));

    }

    public static int soma(int nInicio, int nFinal) {
        int so = 0;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o número de inicio: ");
        nInicio = numero.nextInt();
        System.out.print("Digite o número final: ");
        nFinal = numero.nextInt();
        for (int i = nInicio; i <= nFinal; i++) {
            if (i % 2 != 0) {
                so += i;

            }

        }
        return so;
    }
}
