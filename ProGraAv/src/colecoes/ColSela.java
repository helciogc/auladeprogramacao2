package colecoes;

import java.util.Vector;

import basicas.Sela;

public class ColSela {

	private Vector<Sela> sela;
	
	public ColSela(){
		this.sela = new Vector<Sela>();
	}
	public void adicionarSela (Sela s){
		sela.add(s);
	}
	public Vector<Sela> listarSela(){
		return sela;
	}
	public void remover(Sela s){
		sela.remove(s);
	}
}
