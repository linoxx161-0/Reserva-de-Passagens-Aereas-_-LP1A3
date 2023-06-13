package br.edu.sp.ifsp.lp;

public class Passageiro {
	//Atributos da classe Passageiro
	private String nome;
	private String cpf;
	
	//Construtor da classe Passageiro
	public Passageiro (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}

}
