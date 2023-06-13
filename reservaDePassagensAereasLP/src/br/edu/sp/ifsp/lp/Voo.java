package br.edu.sp.ifsp.lp;

public class Voo {
	
	//Atributos privados da classe Voo
	private Aviao aeronave;
	private int nro;
	private String data;
	private String hora;
	
	//construtor da classe e seus parametros
	public Voo (Aviao aeronave, int nro, String data, String hora) {
		this.aeronave = aeronave;
		this.nro = nro;
		this.data = data;
		this.hora = hora;
	}
	//Get para receber o numero da classe Voo
	public int getNro() {
		return this.nro;
	}
	//Get para receber a data da classe Voo
	public String getData() {
		return this.data;
	}
	//Get para receber a hora da classe Voo
	public String getHora() {
		return this.hora;
	}

}
