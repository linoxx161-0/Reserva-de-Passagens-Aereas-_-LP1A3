package br.edu.sp.ifsp.lp;

//Classe Avião é classe filha de Aeronave
public class Aviao extends Aeronave {
	
	//Matriz Passageiro e atributo lugares
	public Passageiro[][] lugares; 
	
	//Construtor Avião com os parametros modelo, total de fileiras e total de assentos por fileiras
	public Aviao (String modelo, int totalfileiras, int assentosporfileira) {
		//Chamando o atributo Modelo do construtor da classe mãe Aeronave
		super(modelo);
		
		this.lugares = new Passageiro [totalfileiras][assentosporfileira];
	}
	
	public boolean verificarLugarOcupado (int fileira, int assento) {
		//falta comando
	}
	
	public Passageiro getPassageiro (int fileira, int assento) {
		//falta comando
	}
	
	public void setPassageiros (Int fileira, int assento, Passageiro passageiro) {
		//falta comando
	}

}
