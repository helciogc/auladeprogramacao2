package br.com.webarquiteto.fachada;

import java.util.List;

import br.com.webarquiteto.basicas.Fisica;
import br.com.webarquiteto.cadastro.interfaces.InterfaceCadastroFisica;

public class Fachada {

	// atributos
	private InterfaceCadastroFisica clienteFisica;

	// metodos delegados
	
	public void adicionarFisica(Fisica Fi) {
		clienteFisica.adicionarFisica(Fi);
	}

	public void removerFisica(long codFisica) {
		clienteFisica.removerFisica(codFisica);
	}

	public List<Fisica> listarFisica() {
		return clienteFisica.listarFisica();
	}

	public void atualizarPessoa() {
		clienteFisica.atualizarPessoa();
	}

	public Fisica procurarFisica(long codFisica) {
		return clienteFisica.procurarFisica(codFisica);
	}
	
	
}
