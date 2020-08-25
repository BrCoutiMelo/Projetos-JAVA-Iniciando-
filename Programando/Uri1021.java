
public class Uri1021 {
	public static void main(String[]args) {
		digitaNotas(576.73);
		
	}
	public static void digitaNotas(double valor) {
		int cem = (int)(valor / 100);
		valor = valor % 100;
		int cinq = (int)(valor / 50);
		valor = valor % 50;
		int vinte = (int)(valor/20);
		valor = valor % 20;
		int dez = (int)(valor/10);
		valor = valor % 10;
		int cinco = (int)(valor/5);
		valor = valor % 5;
		int dois = (int)(valor/2);
		valor = valor % 2;
		valor *= 100;
		int umrealcents = (int)(valor/100);
		valor = valor % 100;
		int cinquentacents = (int)(valor / 50);
		valor = valor % 50;
		int vintecinco = (int)(valor / 25);
		valor = valor / 25;
		int dezcents = (int)(valor/10);
		valor = valor % 10;
		int cincocents = (int)(valor/ 5);
		valor = valor % 5;
		int umcents = (int)(valor / 1);
		valor = valor % 1;
		
		System.out.println("NOTAS:");
		System.out.println(cem +" nota(s) de R$ 100.00");
		System.out.println(cinq +" nota(s) de R$ 50.00");
		System.out.println(vinte +" nota(s) de R$ 20.00");
		System.out.println(dez +" nota(s) de R$ 10.00");
		System.out.println(cinco +" nota(s) de R$ 5.00");
		System.out.println(dois +" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(umrealcents +" moeda(s) de R$ 1.00");
		System.out.println(cinquentacents+" moeda(s) de R$ 0.50");
		System.out.println(vintecinco+" moeda(s) de R$ 0.25");
		System.out.println(dezcents+ " moeda(s) de R$ 0.10");
		System.out.println(cincocents+" moeda(s) de R$ 0.05");
		System.out.println(umcents+" moeda(s) de R$ 0.01");
		
	}
	
}
