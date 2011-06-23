package br.com.webarquiteto.basicas;

import java.io.Serializable;
import java.util.Date;



public class Juridica extends Cliente implements Serializable{
 

	private static final long serialVersionUID = 1L;

	//atributos primarios
	
	
	 
	private String numCnpj;
	 
	private String contato;

	// construtores
	
	public Juridica() {
		super();
		
	}

	
	public Juridica(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco);
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
 
