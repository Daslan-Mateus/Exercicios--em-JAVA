import java.util.Scanner;

/*
 CALCULE O VALOR FINAL DE UM EMPRÉSTIMO, A PARTIR DO VALOR SOLICITADO.
 TAXAS PARCELAS INFLUENCIAM NO VALOR FINAL. DEFINA ARBITRARIAMENTE O 
 VALOR DAS TAXAS E PARCELAS.
 */

public class Emprestimo {
	
	public static void emprestar(double money){
		Scanner valor = new Scanner(System.in);
		System.out.print("Quanto você precisa ? ");
		double din = valor.nextDouble();
		System.out.print("Quantas vezes ? ");
		int parcela = valor.nextInt();
		
		if(parcela <= 36) {
			double valorFinal = din * 1.2;
			System.out.println("O valor total a pagar do seu emprestimo é: " + valorFinal);
			
		} else {
			double valorFinal = din * 1.5;
			System.out.println("O valor total a pagar do seu emprestimo é: " + valorFinal);
		}
		
		valor.close();
	}
	

	public static void main(String[] args) {
		emprestar(0);

	}

}
