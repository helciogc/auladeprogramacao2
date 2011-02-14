package basicas;

import java.util.Date;

public class Ocorrencias {

	private String detalhes;
	private Date dia;
	
	//Contrutores
	public Ocorrencias(){
		
	}
	public Ocorrencias(String detalhes, Date dia) {
		super();
		this.detalhes = detalhes;
		this.dia = dia;
	}
	
	//Gets e Sets
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	
	
	
	
	
}
