package br.edu.sp.ifsp.lp;

public class Aeronave {
	
	//variável modelo
	protected String modelo;
	
	//construtor Aeronave com parametro da variável modelo
	public Aeronave (String modelo) {
		this.modelo = modelo;
	}
	//método get
	public String getModelo() {
		return this.modelo;
	}
	//método set
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
