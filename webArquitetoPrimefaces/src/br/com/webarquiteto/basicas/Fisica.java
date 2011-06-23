package br.com.webarquiteto.basicas;

import java.io.Serializable;
import java.util.Date;



public class Fisica extends Cliente implements Serializable{
 

	// atributos primarios
	
	private static final long serialVersionUID = 1L;
	private String numCpf;

	// construtores
	


	
	
	public Fisica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String numCpf) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco);
		this.numCpf = numCpf;
	}

	public Fisica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco);
	}

	public Fisica() {
		super();
	}
	

	// gets e sets
	
	

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
	}

	
	
	 
}
 
