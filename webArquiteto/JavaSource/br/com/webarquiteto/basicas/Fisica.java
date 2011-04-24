package br.com.webarquiteto.basicas;

import java.util.Date;



public class Fisica extends Cliente {
 

	// atributos primarios
	
	private long codFisica;
	 
	private String numCpf;

	// construtores
	
	public Fisica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String numCpf) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco);
		this.numCpf = numCpf;
	}

	public Fisica() {
		super();
	}

	// gets e sets
	
	public long getCodFisica() {
		return codFisica;
	}

	public void setCodFisica(long codFisica) {
		this.codFisica = codFisica;
	}

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
	}

	
	
	 
}
 
