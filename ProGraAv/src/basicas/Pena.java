package basicas;

import java.util.Date;

public class Pena {

	private Date inicio;
	private int duracaoMeses;
	private String observacoes;
	
	//Construtores
	
	public Pena(Date inicio, int duracaoMeses, String observacoes) {
		super();
		this.inicio = inicio;
		this.duracaoMeses = duracaoMeses;
		this.observacoes = observacoes;
	}
	
	
	
	//Gets e Sets
	
	public Date getInicio() {
		return inicio;
	}
	
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public int getDuracaoMeses() {
		return duracaoMeses;
	}
	public void setDuracaoMeses(int duracaoMeses) {
		this.duracaoMeses = duracaoMeses;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	
	
}
