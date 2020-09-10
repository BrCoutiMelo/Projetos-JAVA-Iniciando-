import java.util.Scanner;
public class Programando {
	public static void main (String[]args) {
		//Do - While
		Scanner scanner = new Scanner(System.in);
		int notaAluno = 0;
		double media = 0;
		int contador = 0;
		while(notaAluno>=0) {
			notaAluno = scanner.nextInt();
			if(notaAluno>=0) {   //usar numero negativo para encerrar
				media += notaAluno;
				contador++;
			}
		}
		if(contador!=0)
			media /= contador;
		System.out.println("Media: "+media);
	}
	

}
