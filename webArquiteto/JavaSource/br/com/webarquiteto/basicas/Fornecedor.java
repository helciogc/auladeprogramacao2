package br.com.webarquiteto.basicas;

public class Fornecedor extends Pessoa {
 
	// atributos primarios
	
	private long codFornecedor;
	 
	private String linhaDeFornecimento;
	 
	private String contato;
	 
	private String numCnpj;

	// construtores
	
	public Fornecedor(String linhaDeFornecimento, String contato, String numCnpj) {
		super();
		this.linhaDeFornecimento = linhaDeFornecimento;
		this.contato = contato;
		this.numCnpj = numCnpj;
	}

	public Fornecedor() {
		super();
	}

	// gets e sets
	
	public long getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(long codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

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
 
