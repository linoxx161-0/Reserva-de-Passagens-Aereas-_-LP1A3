package br.edu.sp.ifsp.lp;

public class Aeronave {
	
	//vari�vel modelo
	protected String modelo;
	
	//construtor Aeronave com parametro da vari�vel modelo
	public Aeronave (String modelo) {
		this.modelo = modelo;
	}
	//m�todo get
	public String getModelo() {
		return this.modelo;
	}
	//m�todo set
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
