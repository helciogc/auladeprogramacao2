package br.com.webarquiteto.basicas;

import java.util.Date;



public class Juridica extends Cliente {
 
	//atributos primarios
	
	private long codJuridica;
	 
	private String numCnpj;
	 
	private String contato;

	// construtores
	
	public Juridica() {
		super();
		
	}

	public Juridica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco,String numCnpj, String contato) {
		super(nomePessoa, telefoneResidencial, telefoneComercial, telefoneCelular,
				dataNascimento, endereco);
		this.numCnpj = numCnpj;
		this.contato = contato;
	}

	//gets e sets
	
	public long getCodJuridica() {
		return codJuridica;
	}

	public void setCodJuridica(long codJuridica) {
		this.codJuridica = codJuridica;
	}

	public String getNumCnpj() {
		return numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	

	
	
	
	 
}
 
