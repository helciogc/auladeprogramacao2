package br.com.webarquiteto.fachada;

import java.util.List;

import br.com.webarquiteto.basicas.Fisica;
import br.com.webarquiteto.cadastro.*;
import br.com.webarquiteto.cadastro.interfaces.InterfaceCadastroFisica;
import br.com.webarquiteto.colecoes.*;
import br.com.webarquiteto.exception.CpfDuplicadoException;


public class Fachada {

	// atributos
	private InterfaceCadastroFisica clienteFisica;

	// construtores
	public Fachada() {
		super();
		clienteFisica = new CadastroFisica(new ColecaoFisica());
	}
	
	
	// metodos instanciados
	private static Fachada instancia;

	public static Fachada getInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	public void adicionarFisica(Fisica Fi) throws CpfDuplicadoException {
		clienteFisica.adicionarFisica(Fi);
	}

	public void removerFisica(long codFisica) {
		clienteFisica.removerFisica(codFisica);
	}

	public List<Fisica> listarFisica() {
		return clienteFisica.listarFisica();
	}

	public void atualizarFisica(Fisica fis) {
		clienteFisica.atualizarFisica(fis);
	}

	public Fisica procurarFisica(long codFisica) {
		return clienteFisica.procurarFisica(codFisica);
	}

	public Fisica procurarFisicaCpf(String cpf) {
		return clienteFisica.procurarFisicaCpf(cpf);
	}

	public boolean equals(Object arg0) {
		return instancia.equals(arg0);
	}

	public int hashCode() {
		return instancia.hashCode();
	}

	public String toString() {
		return instancia.toString();
	}
	
	
	
	
	
	
}
