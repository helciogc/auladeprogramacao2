package br.com.webarquiteto.basicas;

import java.io.Serializable;
import java.util.Date;



public class Fisica extends Cliente implements Serializable{
 

	// atributos primarios
	
	private static final long serialVersionUID = 1L;
	private String numCpf;

	// construtores
	

	

	
	public Fisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fisica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String email) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco, email);
	}


	public Fisica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String email, String numCpf) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco, email);
		this.numCpf = numCpf;
	}

	// gets e sets
	
	




	public String getNumCpf() {
		return numCpf;
	}



	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
	}

	
	
	 
}
 
