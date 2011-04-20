package br.com.webarquiteto.basicas;

import java.util.Date;
import java.util.List;

public class Pessoa {
 
	// atributos primarios
	private int codPessoa;
	 
	private String nomePessoa;
	 
	private String telefoneResidencial;
	 
	private String telefoneComercial;
	 
	private String telefoneCelular;
	 
	private Date dataNascimento;
	 

	 
	// atributos secundarios
	private Endereco endereco;
	 
	private Fisica fisica;
	 
	private Juridica juridica;
	 
	private Funcionario funcionario;
	 
	private Fornecedor fornecedor;

	// contrutores
	public Pessoa(int codPessoa, String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento) {
		super();
		this.codPessoa = codPessoa;
		this.nomePessoa = nomePessoa;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneCelular = telefoneCelular;
		this.dataNascimento = dataNascimento;

		this.endereco = endereco;
		this.fisica = fisica;
		this.juridica = juridica;
		this.funcionario = funcionario;
		this.fornecedor = fornecedor;
	}

	public Pessoa(){
		
	}
	
	
	// gets e sets
	
	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
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

	public Fisica getFisica() {
		return fisica;
	}

	public void setFisica(Fisica fisica) {
		this.fisica = fisica;
	}

	public Juridica getJuridica() {
		return juridica;
	}

	public void setJuridica(Juridica juridica) {
		this.juridica = juridica;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	 
	
	 
}
 
