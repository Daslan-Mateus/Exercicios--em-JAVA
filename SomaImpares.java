
/*
Desenvolva um programa que calcule a soma de todos os números ́ımpares numa
determinada faixa de números. O usuário deve informar o n umero inicial e o numero final.
*/

import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {
        System.out.println(soma());

    }

    public static int soma() {
        int so = 0;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o número de inicio: ");
        int n = numero.nextInt();
        System.out.print("Digite o número final: ");
        int m = numero.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                so += i;

            }
            numero.close();
        }
        return so;

    }

}
