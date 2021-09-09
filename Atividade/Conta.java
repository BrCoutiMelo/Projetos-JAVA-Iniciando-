package Atividade;

public abstract class Conta {
	
	private int agencia;
	private int conta;
	private String titular;
	private double limite;
	private static double saldo;
	private double valorLimite; 
	
	
	
	public Conta(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.limite = limite;
		Conta.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		Conta.saldo = saldo;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public final double sacar(double sacar) {
		if(saldo < limite) {
			saldo = saldo - sacar;
			
		}else {
			System.out.println("Saldo Insuficiente");
		}
		return saldo;
			
	}
		
	public final void depositar(int agencia, int conta) {
		
		
	}
	public void setValorLimite() {
		
	}
	
}
