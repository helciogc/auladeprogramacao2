package br.com.webarquiteto.basicas;



public class Endereco {
 
	// atributos primarios
	
	private long codEnd;
	 
	private String nomeRua;
	 
	private String cep;
	 
	private String nomeBairro;
	 
	private String nomeCidade;
	 
	private String nomeUf;

	// construtores
	
	public Endereco(String nomeRua, String cep, String nomeBairro,
			String nomeCidade, String nomeUf) {
		super();
		this.nomeRua = nomeRua;
		this.cep = cep;
		this.nomeBairro = nomeBairro;
		this.nomeCidade = nomeCidade;
		this.nomeUf = nomeUf;
	}

	public Endereco() {
		super();
	}

	// gets e sets
	
	public long getCodEnd() {
		return codEnd;
	}

	public void setCodEnd(long codEnd) {
		this.codEnd = codEnd;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeUf() {
		return nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}
	 
	
}
 
