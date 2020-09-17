package Imoveis;

public class imoveis {
	String apto; String casa; 
	int pavimentoPredio; int quartos; int suites; int banheiros;
	double metrosQuadrados;
	boolean piscina; boolean quadra; boolean elevador;
	
	imoveis(String casa, int quartos, int suites, int banheiros, double metrosQuadrados, boolean piscina, boolean quadra){
		this.casa = casa;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados=metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
			
	imoveis(String apto, int pavimentoPredio, int quartos, int suites, int banheiros, double metrosQuadrados, boolean piscina, boolean quadra, boolean elevador){
		this.apto = apto;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados=metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
		this.pavimentoPredio = pavimentoPredio;
	}	

	double calculaPreco() {
		double precoBase = 0;
		if(casa=casa)
			int precoBase = metrosQuadrados * 5000;
		
		
	}







}



