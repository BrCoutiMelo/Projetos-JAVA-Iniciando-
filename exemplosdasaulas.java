
public class exemplosdasaulas {
	public static void main(String[] args) {
		double altura = 1.85;
		double peso = 10;
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			
			System.out.println("Magreza");
		} else if (imc < 17) {
			System.out.println("Magreaz leve");
		} else if (imc < 25 ) {
			System.out.println("Magreza grave");
		}
	}
}
