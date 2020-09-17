//========================================//
//==___EXERCÍCIO DE NÚMEROS PARES___==
//=======================================//

import java.util.Scanner;
class exercicios {
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in); //Imprimir numeros pares de 25;
		int contador = 0;
		int andador = 0;
		while(andador<=5) {
			int numeros = n.nextInt();
			if(numeros%2==0)
				contador+=1;
				andador+=1;
			if(numeros%2!=0)
				andador += 1;
			
		}
		
		System.out.println("a quantidade de numeros pares é: "+contador);
		
	}
	
}

