package br.com.webarquiteto.basicas;

import java.util.Date;



public class Fornecedor extends Pessoa {
 
	// atributos primarios
	
	
	private String linhaDeFornecimento;
	 
	private String contato;
	 
	private String numCnpj;

	// construtores
	
	


	
	public Fornecedor(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String linhaDeFornecimento,
			String contato, String numCnpj, String email) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco, email);
		this.linhaDeFornecimento = linhaDeFornecimento;
		this.contato = contato;
		this.numCnpj = numCnpj;
	}



	public Fornecedor(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String email) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco, email);
	}



	public Fornecedor() {
		super();
	}

	// gets e sets
	
	public String getLinhaDeFornecimento() {
		return linhaDeFornecimento;
	}

	public void setLinhaDeFornecimento(String linhaDeFornecimento) {
		this.linhaDeFornecimento = linhaDeFornecimento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getNumCnpj() {
		return numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}
	
	
	 
}
 
