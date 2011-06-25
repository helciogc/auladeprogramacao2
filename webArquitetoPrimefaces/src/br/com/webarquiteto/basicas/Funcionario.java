package br.com.webarquiteto.basicas;

import java.io.Serializable;
import java.util.Date;



public class Funcionario extends Pessoa  implements Serializable{
	
	// atributos primarios
	
	private static final long serialVersionUID = 1L;

	private String numCrea;
	 
	private String cargo;
	 
	private String profissao;
	 
	private String senha;
	 
	private String login;
	 
	private int nivelAcesso;
	 
	private String numCpf;

	// construtores
	
	public Funcionario(String numCrea, String cargo, String profissao,
			String senha, String login, int nivelAcesso, String numCpf) {
		super();
		this.numCrea = numCrea;
		this.cargo = cargo;
		this.profissao = profissao;
		this.senha = senha;
		this.login = login;
		this.nivelAcesso = nivelAcesso;
		this.numCpf = numCpf;
	}

	public Funcionario() {
		super();
	}
	
	
	
	public Funcionario(String nomePessoa, String telefoneResidencial,
			String telefoneComercial, String telefoneCelular,
			Date dataNascimento, Endereco endereco, String email) {
		super(nomePessoa, telefoneResidencial, telefoneComercial,
				telefoneCelular, dataNascimento, endereco, email);
	}

	

	// gets e sets
	
	public String getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(String numCrea) {
		this.numCrea = numCrea;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
	}
	
	
	
	 
}
 
