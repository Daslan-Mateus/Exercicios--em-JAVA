import java.util.Scanner;


 //A PARTIR DA HORA DO DIA, INFORME A SAUDAÇÃO ADEQUADA: BOM DIA, BOA TARDE, BOA NOITE.


public class Sausacao {
	
	public static void comprimentar() {
		Scanner h = new Scanner(System.in);
		System.out.println("Informe a Hora: ");
		double horaDia = h.nextDouble();
		
		if (horaDia <= 12) {
			
			System.err.println("Bom dia");
		} else if (horaDia <= 17) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
		h.close();
	}

	public static void main(String[] args) {
		comprimentar();
	}

}
