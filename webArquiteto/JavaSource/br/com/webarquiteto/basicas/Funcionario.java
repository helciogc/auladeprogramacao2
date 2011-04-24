package br.com.webarquiteto.basicas;



public class Funcionario extends Pessoa {
	
	// atributos primarios
	
	private long codFuncionario;
	 
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
	
	// gets e sets
	
	public long getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(long codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

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
 
