import java.util.Scanner;
public class ExercicioSimpleDePares2 {
	public static void main(String[]args) {
		Scanner digitar = new Scanner(System.in);
		int contadorPares = 0;
		int media = 0;
		int numeros = digitar.nextInt();
		int contadorImpares = 0;
		while(numeros!=100) {
			if(numeros % 2 == 0)
				contadorPares += 1;
				media += numeros;
			if(numeros%2 !=1)
				contadorImpares += 1;
		int calculaMedia = media/contadorPares;
		}	
			System.out.println("A Mèdia de numeros pares é: "+calculaMedia);
		
		}
				
	
}


	

