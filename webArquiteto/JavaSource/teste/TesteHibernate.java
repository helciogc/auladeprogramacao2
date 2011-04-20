package teste;



import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.colecoes.*;

public class TesteHibernate {
	public static void main(String[] args) {
		ColecaoPessoa cp = new ColecaoPessoa();
		

		Pessoa d1 = new Pessoa(1,"helcio","1234","12359",null,null);
				
		cp.adicionarPessoa(d1);
		
	
		
	}
}
