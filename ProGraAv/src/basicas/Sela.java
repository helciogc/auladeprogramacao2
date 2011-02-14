package basicas;

import java.util.Vector;

public class Sela {

	private int capacidade;
	private String descricao;
	private Vector <Detento> detento;
	private Pavilhao pavilhao;
	
	
	//Construtores
	public Sela(){
		
	}	
	
	public Sela(int capacidade, String descricao,Pavilhao pavilhao) {
		super();
		this.pavilhao=pavilhao;
		this.capacidade = capacidade;
		this.descricao = descricao;
		this.detento = new Vector<Detento>();
	}

	//Gets e Sets
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Vector<Detento> getDetento() {
		return detento;
	}

	public void setDetento(Vector<Detento> detento) {
		this.detento = detento;
	}

	public Pavilhao getPavilhao() {
		return pavilhao;
	}

	public void setPavilhao(Pavilhao pavilhao) {
		this.pavilhao = pavilhao;
	}

	//Metodos basicos
	
	public boolean verificarLotacaoAcimadaSela(){
		return detento.size()>capacidade;
	}

	

	
	
	
	
	
}
