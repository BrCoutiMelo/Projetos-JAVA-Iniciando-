import java.util.Scanner;
import java.util.Locale;
class exercicios {
	public static void main(String[]args) {
		Scanner vc = new Scanner(System.in); //Imprimir numeros pares de 25;
		int contador = 0;
		while(contador<=5) {
			int numeros = vc.nextInt();
			if(numeros % 2 ==0)
				contador =+ 1;
			
			System.out.println("Numeros pares dentre os 25 numeros: "+contador);
		}
		
		
	}
	
}

