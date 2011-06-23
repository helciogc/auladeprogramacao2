package br.com.webarquiteto.basicas;

import java.util.Date;


public class Pessoa {
 
	// atributos primarios
	private long codPessoa;
	 
	private String nomePessoa;
	 
	private String telefoneResidencial;
	 
	private String telefoneComercial;
	 
	private String telefoneCelular;
	 
	private Date dataNascimento;
	 

	 
	// atributos secundarios
	private Endereco endereco;
	 
	
	// contrutores
	
	public Pessoa(){
		
	}
	
	
	public Pessoa(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco) {
		super();
		this.nomePessoa = nomePessoa;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneCelular = telefoneCelular;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}


	// gets e sets
	
	public long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(long codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	 
	
	 
}
 
