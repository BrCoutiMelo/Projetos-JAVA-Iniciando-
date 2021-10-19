	package Streaming;



public class Filmes {

	private String nomeFilme;
	private String diretor;
	private int anoLancamento;
	private int idFilme;
	
	
	public Filmes(String nomeFilme,String diretor, int anoLancamento,int idFilme) {
		this.nomeFilme = nomeFilme;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
		this.idFilme = idFilme;
		
		
	}


	public String getNomeFilme() {
		return nomeFilme;
	}


	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}


	public String getDiretor() {
		return diretor;
	}


	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}


	public int getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public int getIdFilme() {
		return idFilme;
	}


	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	
}
