package ClassesEObjetos;

public class carros_catchau {
	String nome; String cor; String marca;
	int portas;
	boolean vidrosEletricos, arCondicionado, cambioAutomatico,direcaoHidraulica;
	double precoBase;
	
	carros_catchau(String nome, String marca, double precoBase, String string, boolean b, boolean c, boolean d, boolean e, int i){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = "Branca";
		this.vidrosEletricos = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoHidraulica = false;
				
		
			
		}

	carros_catchau(String nome, String marca, String cor, double precoBase, int portas, boolean vidrosEletricos, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoHidraulica){
			this.nome = nome;
			this.marca = marca;
			this.precoBase = precoBase;
			this.portas = 2;
			this.cor = "Branca";
			this.vidrosEletricos = false;
			this.arCondicionado = false;
			this.cambioAutomatico = false;
			this.direcaoHidraulica = false;
	}

		carros_catchau(){}
		
		double calculaPreco() {
			double precoBase =0;
			switch(cor) {
				case "Branca":
				case "Vermelha":
				case "Preta": break;
				default: precoBase += 1000;
			}
		if(vidrosEletricos)
			precoBase += 1250;
		if(cambioAutomatico)
			precoBase += 1250;
		if(arCondicionado)
			precoBase += 1250;
		if(direcaoHidraulica)
			precoBase += 1250;
		return precoBase;
		
		}
		
		 public String toString() {
			String descrisao = "";
			descrisao += "Nome: "+nome+", Marca: "+marca+"Portas: "+portas;		
			descrisao += "Cor: "+cor+"Vidros Eletricos: "+vidrosEletricos+"Ar Condicionado"+arCondicionado;
			descrisao += "Preco: "+calculaPreco();
			return descrisao;
		 }
}
	
	


		


