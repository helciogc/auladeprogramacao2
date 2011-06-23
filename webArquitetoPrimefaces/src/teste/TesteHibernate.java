package teste;



import br.com.webarquiteto.basicas.*;
import br.com.webarquiteto.colecoes.*;
import br.com.webarquiteto.interfaces.InterfaceColecaoFisica;

public class TesteHibernate {
	public static void main(String[] args) {
		InterfaceColecaoFisica cp = new ColecaoFisica();
		
		Fisica fi = new Fisica("helcio", "123455", "teeComercial", "telCelular", null, new Endereco("sabia","24678","paulo","salvador","ba"), "numCpf");
		System.out.println("teste 1");
		cp.adicionarFisica(fi);
		Fisica a = cp.procurarFisica(1);
			
		System.out.println( a.getTelefoneCelular());
		System.out.println( a.getNomePessoa());
				
		/*System.out.println("teste 2");
		long codFisica = 1;
		cp.removerFisica(codFisica);
		
		
		System.out.println( a.getTelefoneCelular());
		System.out.println( a.getNomePessoa());*/
		
	}
}
