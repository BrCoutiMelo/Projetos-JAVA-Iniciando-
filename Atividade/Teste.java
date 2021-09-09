package Atividade;

public class Teste {

	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca(0004, 245, "Breno", 2500, 5000, 2500);
		
		
		ContaCorrente c2 = new ContaCorrente(0002, 570, "Joao", 600, 7850, 2500);
		
		
		System.out.println(c1.getAgencia());
		System.out.println(c2.getLimite());
		
	}
	
	
}
