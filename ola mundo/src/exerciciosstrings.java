
public class exerciciosstrings {
	public static void main(String[]args) {
		
		String nome, marca, cor;
		int portas;
		boolean vidroEletrico, arCondicionado;
		double precoBase;
		
		Carro(String nome, String marca, double precoBase){
			this.nome = nome;
			this.marca = marca;
			this.precoBase = precoBase;
			this.portas = 2;
			this.cor = "Branca";
			this.vidroEletrico = false;
			this.arCondicionado = false;
			this.cambioAutomatico = false;
			this.direcaoHidraulica = false;
			
			
		}
		Carro(String nome, String marca, String cor, int portas, boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase){
			
		}
	}
}
