package testes;

import basicas.Detento;
import colecoes.ColDetento;

public class testeDetento {

	public static void main(String[] args){
		ColDetento colecao = new ColDetento();
		
		System.out.println("Depois Construtor");
		for(Detento d: colecao.listarDetentos()){
			System.out.println(d.getNome());
		}
		System.out.println("------------------");
	}
}
