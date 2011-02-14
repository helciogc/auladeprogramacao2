package colecoes;

import java.util.Vector;

import basicas.Detento;

public class ColDetento {

	private Vector<Detento> detento;
	
	public ColDetento(){
		detento = new Vector<Detento>();
	}
	public void adicionarDetento(Detento d){
		detento.add(d);
	}
	public Vector<Detento>listarDetentos(){
		return detento;
	}
	public void remover(Detento d){
		detento.remove(d);
	}
	public void listarDetentoPorSexo(){
		int totalMacho=0;
		int totalMule=0;
		
		for(Detento d: detento){
			if(d.getSexo().equalsIgnoreCase("Masc")){
				totalMacho++;
			}else{
				totalMule++;
			}
		}
		System.out.println("Homens:"+totalMacho);
		System.out.println("Mulher:"+totalMule);
		
		
	}
}
